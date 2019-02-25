package com.dustinbowman.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String role;

    @ManyToOne
    @JoinColumn(name = "userName",referencedColumnName = "userName", nullable = false)
    private User user;
}
