package com.skypro.online_store.controller;

import com.skypro.online_store.service.OnlineStoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class OnlineStoreController {
    private final OnlineStoreService onlineStoreService;

    public OnlineStoreController(OnlineStoreService onlineStoreService) {
        this.onlineStoreService = onlineStoreService;
    }

    @GetMapping("/store/order/get")
    public List<Integer> getOrdersId() {
        return onlineStoreService.getOrderId();
    }

    @PostMapping("/store/order/add ")
    public void addOrders(Integer[] integers) {
        onlineStoreService.addOrder(integers);
    }
}
