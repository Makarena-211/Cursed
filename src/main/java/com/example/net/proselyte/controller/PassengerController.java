package com.example.net.proselyte.controller;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.model.Passanger;
import com.example.net.proselyte.service.PassangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/**
 *  Класс PassengerController, отвечающий за управление потоком данных в MVC паттерне.
 *  Получает запросы от View, обрабатывает их и возвращает результат.
 *  Связывает Model и View, обеспечивая передачу данных между ними.
 */
@Controller

public class PassengerController {

    @Autowired
    private final PassangerService passangerService;

    public PassengerController(PassangerService passangerService){
        this.passangerService=passangerService;
    }

    @RequestMapping("/passangers")
    public String findByKey(Model model, @Param("keyword") String keyword){
        List<Passanger> passangers = passangerService.listAll(keyword);
        model.addAttribute("passangers", passangers);
        model.addAttribute("keyword", keyword);
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
