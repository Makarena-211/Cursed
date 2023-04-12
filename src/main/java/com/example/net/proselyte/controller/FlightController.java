package com.example.net.proselyte.controller;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FlightController {
    @Autowired
    private final FlightService flightService;

    public FlightController(FlightService flightService){
        this.flightService=flightService;
    }

    @GetMapping("/flights")
    public String findAll(Model model){
        List<Flight> flights = flightService.findAll();
        model.addAttribute("flights", flights);
        return "flight-list";
    }
    @GetMapping("/flight-create")
    public String createFlightForm(Flight flight){
        return "flight-create";
    }
    @PostMapping("/flight-create")
    public String createFlight(Flight flight){
        flightService.saveFlight(flight);
        return "redirect:/flights";
    }
    @GetMapping("/flight-delete/{id}")
    public String deleteFlight(@PathVariable("id") Long id){
        flightService.deleteById(id);
        return "redirect:/flights";
    }
    @GetMapping("/flight-update/{id}")
    public String updateFlightForm(@PathVariable("id") Long id, Model model){
        Flight flight = flightService.findById(id);
        model.addAttribute("flight", flight);
        return "/flight-update";
    }
    @PostMapping("/flight-update")
    public String updateFlight(Flight flight){
        flightService.saveFlight(flight);
        return "redirect:/flights";
    }

}
