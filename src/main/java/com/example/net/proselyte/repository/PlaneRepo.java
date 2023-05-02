package com.example.net.proselyte.repository;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.model.Passanger;
import com.example.net.proselyte.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PlaneRepo extends JpaRepository<Plane, Long> {
    Optional<Plane> findById(Long id);
    @Query("SELECT p FROM Plane p WHERE CONCAT(p.id, '', p.count_pass, '', p.name, '', p.type) LIKE %?1%")
    List<Plane> search(String keyword);

}
