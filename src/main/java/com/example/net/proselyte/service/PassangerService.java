package com.example.net.proselyte.service;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.model.Passanger;
import com.example.net.proselyte.repository.PassangerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  Класс, отвечающий за обработку данных о пассажирах в MVC паттерне.
 *  Получает данные о рейсах от репозитория (PassangerRepo), обрабатывает их и возвращает результат.
 *  Связывает контроллер (PassengerController) и модель (Passanger) через репозиторий (PassengerRepo).
 */
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
    public Passanger savePassanger(Passanger passanger){
        return passangerRepo.save(passanger);
    }
    public void deleteById(Long id){
        passangerRepo.deleteById(id);
    }

    public List<Passanger> listAll(String keyword) {
        if (keyword != null) {
            return passangerRepo.search(keyword);
        } else {
            return passangerRepo.findAll();
        }
    }
}
