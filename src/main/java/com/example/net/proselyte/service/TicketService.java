package com.example.net.proselyte.service;

import com.example.net.proselyte.model.Ticket;
import com.example.net.proselyte.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private final TicketRepo ticketRepo;

    public TicketService(TicketRepo ticketRepo){
        this.ticketRepo = ticketRepo;
    }
    public Ticket findById(Long id){
        return ticketRepo.findById(id).get();
    }
    public List<Ticket> findAll(){
        return ticketRepo.findAll();
    }
    public Ticket saveTicket(Ticket ticket){
        return ticketRepo.save(ticket);
    }
    public void deleteById(Long id){
        ticketRepo.deleteById(id);
    }
}

