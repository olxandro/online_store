package com.skypro.online_store.controller;

import com.skypro.online_store.model.Basket;
import com.skypro.online_store.service.OnlineStoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OnlineStoreController {
    private final OnlineStoreService onlineStoreService;

    public OnlineStoreController(OnlineStoreService onlineStoreService) {
        this.onlineStoreService = onlineStoreService;
    }

    @GetMapping("/order/get")
    public Basket getOrdersId() {
        return onlineStoreService.getOrderIds();
    }

    @RequestMapping("/order/add ")
    public Basket addOrders(@RequestParam("id") List<Integer> ids) {
        return onlineStoreService.addOrderIds(ids);
    }
}
