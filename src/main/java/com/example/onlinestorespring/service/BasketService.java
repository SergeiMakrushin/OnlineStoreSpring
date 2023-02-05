package com.example.onlinestorespring.service;

import com.example.onlinestorespring.basket.Baskets;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Service
public class BasketService {

    private final Baskets baskets;

    public BasketService(Baskets baskets) {
        this.baskets = baskets;
    }


    public Collection<Integer> getAllBasket() {
        return this.baskets.getAllBasket();
    }

    public void addBasket(List<Integer> ids) {
        this.baskets.addBasket(ids);
    }

}
