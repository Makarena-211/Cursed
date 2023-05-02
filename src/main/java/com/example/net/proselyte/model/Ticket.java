package com.example.net.proselyte.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Sirname")
    private String Sirname;
    @Column(name = "Birthdate")
    private Date Birthdate;
    @Column(name = "Series")
    private int Series;
    @Column(name = "Num")
    private int Num;


}

