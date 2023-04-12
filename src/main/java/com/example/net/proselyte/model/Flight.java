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
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "to_col")
    private String to_col;
    @Column(name = "from_col")
    private String from_col;
    @Column(name = "date_dep")
    private Date date_dep;
    @Column(name = "date_arr")
    private Date date_arr;
    @Column(name = "ticket_type")
    private String ticket_type;
    @Column(name = "plane_id")
    private int plane_id;



}
