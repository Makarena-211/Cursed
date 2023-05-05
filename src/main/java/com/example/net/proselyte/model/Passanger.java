package com.example.net.proselyte.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

/**
 *  Класс Passanger, отвечающий за подключение и инициализацию модели passangers в MVC паттерне.
 *  Используется для создания объекта модели и установки его свойств.
 *  Обеспечивает доступ к методам модели для контроллера и представления.
 */
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
