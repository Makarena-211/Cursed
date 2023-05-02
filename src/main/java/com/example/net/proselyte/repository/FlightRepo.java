package com.example.net.proselyte.repository;

import com.example.net.proselyte.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FlightRepo extends JpaRepository<Flight, Long> {
    Optional<Flight> findById(Long id);
    @Query("SELECT f FROM Flight f WHERE CONCAT(f.id, '', f.to_col, '', f.from_col, '', f.date_dep, '', f.date_arr, '', f.ticket_type, '', f.plane_id) LIKE %?1%")
    List<Flight> search(String keyword);

}

