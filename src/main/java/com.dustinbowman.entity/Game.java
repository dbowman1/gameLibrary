package com.dustinbowman.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Game.
 */
@Data
@Entity(name = "Game")
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "game_id")
    private int gameId;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany (mappedBy = "games",
            cascade = {CascadeType.MERGE ,CascadeType.PERSIST})
    private Set<User> users = new HashSet<>();

}