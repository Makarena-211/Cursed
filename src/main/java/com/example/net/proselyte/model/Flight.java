package com.example.net.proselyte.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

/**
 *  Класс Flight, отвечающий за подключение и инициализацию модели flights в MVC паттерне.
 *  Используется для создания объекта модели и установки его свойств.
 *  Обеспечивает доступ к методам модели для контроллера и представления.
 */

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
