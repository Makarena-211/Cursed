package com.example.net.proselyte.repository;

import com.example.net.proselyte.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepo extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findById(Long id);
}


