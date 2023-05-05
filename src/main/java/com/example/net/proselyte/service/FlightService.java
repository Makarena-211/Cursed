package com.example.net.proselyte.service;

import com.example.net.proselyte.model.Flight;
import com.example.net.proselyte.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  Класс, отвечающий за обработку данных о рейсах в MVC паттерне.
 *  Получает данные о рейсах от репозитория (FlightRepo), обрабатывает их и возвращает результат.
 *  Связывает контроллер (FlightController) и модель (Flight) через репозиторий (FlightRepo).
 */
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
    public Flight saveFlight(Flight flight){
        return flightRepo.save(flight);
    }
    public void deleteById(Long id){
        flightRepo.deleteById(id);
    }
    public List<Flight> listAll(String keyword) {
        if (keyword != null) {
            return flightRepo.search(keyword);
        } else {
            return flightRepo.findAll();
        }
    }
}
