package com.skypro.online_store.model;

import org.springframework.context.annotation.Scope;

import java.util.List;

@Scope(scopeName = "prototype")
public class Basket {
    private final List<Integer> orderList;

    public Basket(List<Integer> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "orderList=" + orderList +
                '}';
    }
}
