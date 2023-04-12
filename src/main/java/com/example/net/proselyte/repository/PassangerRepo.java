package com.example.net.proselyte.repository;

import com.example.net.proselyte.model.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PassangerRepo extends JpaRepository<Passanger, Long> {
    Optional<Passanger> findById(Long id);
}
