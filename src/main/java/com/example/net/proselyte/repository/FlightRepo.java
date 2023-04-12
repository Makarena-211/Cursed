package com.example.net.proselyte.repository;

import com.example.net.proselyte.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightRepo extends JpaRepository<Flight, Long> {
    Optional<Flight> findById(Long id);
}
