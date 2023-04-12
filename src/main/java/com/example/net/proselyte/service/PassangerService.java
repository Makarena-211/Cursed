package com.example.net.proselyte.service;

import com.example.net.proselyte.model.Passanger;
import com.example.net.proselyte.repository.PassangerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PassangerService {
    @Autowired
    private final PassangerRepo passangerRepo;

    public PassangerService(PassangerRepo passangerRepo){
        this.passangerRepo = passangerRepo;
    }
    public Passanger findById(Long id){
        return passangerRepo.findById(id).get();
    }
    public List<Passanger> findAll(){
        return passangerRepo.findAll();
    }
    public Passanger savePassanger(Passanger passanger){
        return passangerRepo.save(passanger);
    }
    public void deleteById(Long id){
        passangerRepo.deleteById(id);


    }
}
