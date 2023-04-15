package com.example.net.proselyte.service;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private final FlightRepo flightRepo;

    public FlightService(FlightRepo flightRepo){
        this.flightRepo = flightRepo;
    }
    public Flight findById(Long id){
        return flightRepo.findById(id).get();
    }
    public List<Flight> findAll(){
        return flightRepo.findAll();
    }
    public Flight saveFlight(Flight flight){
        return flightRepo.save(flight);
    }
    public void deleteById(Long id){
        flightRepo.deleteById(id);
    }
    public List<Flight> sortById(){
        return flightRepo.findAll(Sort.by("id"));
    }
}
