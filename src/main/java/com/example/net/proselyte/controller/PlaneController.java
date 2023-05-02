package com.example.net.proselyte.controller;
import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.model.Plane;
import com.example.net.proselyte.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class PlaneController {
    @Autowired
    private final PlaneService planeService;
    public PlaneController(PlaneService planeService){
        this.planeService=planeService;
    }
/*
    @GetMapping("/planes")
    public String findAll(Model model){
        List<Plane> planes = planeService.findAll();
        model.addAttribute("planes", planes);
        return "plane-list";
    }

 */
    @RequestMapping("/planes")
    public String findByKey(Model model, @Param("keyword") String keyword){
        List<Plane> planes = planeService.listAll(keyword);
        model.addAttribute("planes", planes);
        model.addAttribute("keyword", keyword);
        return "plane-list";
    }
    @GetMapping("/plane-create")
    public String createPlaneForm(Plane plane){
        return "plane-create";
    }
    @PostMapping("/plane-create")
    public String createPlane(Plane plane){
        planeService.savePlane(plane);
        return "redirect:/planes";
    }
    @GetMapping("/plane-delete/{id}")
    public String deletePlane(@PathVariable("id") Long id){
        planeService.deleteById(id);
        return "redirect:/planes";
    }
    @GetMapping("/plane-update/{id}")
    public String updatePlaneForm(@PathVariable("id") Long id, Model model){
        Plane plane = planeService.findById(id);
        model.addAttribute("plane", plane);
        return "/plane-update";
    }
    @PostMapping("/plane-update")
    public String updatePlane(Plane plane){
        planeService.savePlane(plane);
        return "redirect:/planes";
    }
}
