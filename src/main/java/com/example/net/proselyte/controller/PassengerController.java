package com.example.net.proselyte.controller;

import com.example.net.proselyte.model.Passanger;
import com.example.net.proselyte.service.PassangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class PassengerController {

    @Autowired
    private final PassangerService passangerService;

    public PassengerController(PassangerService passangerService){
        this.passangerService=passangerService;
    }

    @GetMapping("/passangers")
    public String findAll(Model model){
        List<Passanger> passangers = passangerService.findAll();
        model.addAttribute("passangers", passangers);
        return "passanger-list";
    }
    @GetMapping("/passanger-create")
    public String createPassangerForm(Passanger passanger){
        return "passanger-create";
    }
    @PostMapping("/passanger-create")
    public String createPassanger(Passanger passanger){
        passangerService.savePassanger(passanger);
        return "redirect:/passangers";
    }
    @GetMapping("/passanger-delete/{id}")
    public String deletePassanger(@PathVariable("id") Long id){
        passangerService.deleteById(id);
        return "redirect:/passangers";
    }
    @GetMapping("/passanger-update/{id}")
    public String updatePassangerForm(@PathVariable("id") Long id, Model model){
        Passanger passanger = passangerService.findById(id);
        model.addAttribute("passanger", passanger);
        return "/passanger-update";
    }
    @PostMapping("/passanger-update")
    public String updatePassanger(Passanger passanger){
        passangerService.savePassanger(passanger);
        return "redirect:/passangers";
    }

}
