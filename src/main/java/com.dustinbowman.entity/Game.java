package com.dustinbowman.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Game")
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
    //hi

}
