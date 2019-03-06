package com.dustinbowman.entity;



import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * The type User.
 */
@Entity(name = "User")
@Table(name = "users")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;


    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Role> roles = new HashSet<>();

    /**
     * The Games.
     */
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "game_user",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = { @JoinColumn(name = "game_id")})
    Set<Game> games = new HashSet<>();

    public User() {

    }

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public User(String userName, String password, String email, Set<Role> roles, Set<Game> games) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.roles = roles;
    }

    public User(String userName, String password, String email, Set<Game> games) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.games = games;
    }

    /**
     * Add role.
     *
     * @param role the role
     */
    public void addRole(Role role) {
        roles.add(role);
    }

    public void addGame(Game g) {
        games.add(g);
    }

    public void removeGame(Game g) {
        games.remove(g);
    }

}
