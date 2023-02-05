package com.example.onlinestorespring.basket;


import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Repository
@SessionScope
public class Baskets {
    private final List<Integer> basketsId = new LinkedList<>();


    public Collection<Integer> getAllBasket() {
        return this.basketsId;
    }


    public void addBasket(List<Integer> ids) {
        this.basketsId.addAll(ids);
    }

}
