package com.example.net.proselyte.model;

import jakarta.persistence.*;

import lombok.*;


import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "passangers")
public class Passanger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "sirname")
    private String sirname;
    @Column(name = "birthdate")
    private Date birthdate;
}
