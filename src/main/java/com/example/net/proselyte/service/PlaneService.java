package com.example.net.proselyte.service;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.model.Plane;
import com.example.net.proselyte.repository.PlaneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneService {
    @Autowired
    private final PlaneRepo planeRepo;

    public PlaneService(PlaneRepo planeRepo){
        this.planeRepo = planeRepo;
    }
    public Plane findById(Long id){
        return planeRepo.findById(id).get();
    }
    public List<Plane> findAll(){
        return planeRepo.findAll();
    }
    public Plane savePlane(Plane plane){
        return planeRepo.save(plane);
    }
    public void deleteById(Long id){
        planeRepo.deleteById(id);
    }
    public List<Plane> listAll(String keyword) {
        if (keyword != null) {
            return planeRepo.search(keyword);
        } else {
            return planeRepo.findAll();
        }
    }
}
