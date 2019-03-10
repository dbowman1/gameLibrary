package com.dustinbowman.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity(name = "Role")
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String role;

    @ToString.Exclude
    @ManyToOne
    private User user;

}
