package com.example.net.proselyte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *  Класс PageController, отвечающий за управление потоком данных в MVC паттерне.
 *  Получает запросы от View, обрабатывает их и возвращает результат.
 *  Связывает Model и View, обеспечивая передачу данных между ними.
 */
@Controller
public class PageController {
    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }
}
