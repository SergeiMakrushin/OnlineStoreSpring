package com.example.onlinestorespring.controller;

import com.example.onlinestorespring.service.BasketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/get")
    public ResponseEntity<Collection<Integer>> getBasket() {
        return new ResponseEntity<>(this.basketService.getAllBasket(), HttpStatus.OK);
    }

    @GetMapping("/add")
    public ResponseEntity<List> creatBasket(@RequestParam("id") List<Integer> ids) {
        this.basketService.addBasket(ids);
        return new ResponseEntity<>(ids, HttpStatus.OK);
    }

}

