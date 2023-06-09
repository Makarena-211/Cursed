package com.example.net.proselyte.repository;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.model.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.parameters.P;

import java.util.List;
import java.util.Optional;

/**
 *  Класс, представляющий собой репозиторий для хранения данных о пассажирах в MVC паттерне.
 *  Используется для получения, добавления, обновления и удаления данных о пассажирах.
 *  Реализует паттерн репозитория для удобства работы с данными.
 */

public interface PassangerRepo extends JpaRepository<Passanger, Long> {
    Optional<Passanger> findById(Long id);
    @Query("SELECT p FROM Passanger p WHERE CONCAT(p.id, '', p.name, '', p.sirname, '', p.birthdate) LIKE %?1%")
    List<Passanger> search(String keyword);
}
