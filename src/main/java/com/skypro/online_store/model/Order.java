package com.skypro.online_store.model;

public class Order {
    private final int id;

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Заказ №" + id;
    }
}
