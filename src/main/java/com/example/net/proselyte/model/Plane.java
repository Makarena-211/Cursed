package com.example.net.proselyte.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "planes")
public class Plane {

    @Id
    private Long id;
    @Column(name = "count_pass")
    private int count_pass;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
}
