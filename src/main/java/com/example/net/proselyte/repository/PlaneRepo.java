package com.example.net.proselyte.repository;

import com.example.net.proselyte.model.Passanger;
import com.example.net.proselyte.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaneRepo extends JpaRepository<Plane, Long> {
    Optional<Plane> findById(Long id);
}
