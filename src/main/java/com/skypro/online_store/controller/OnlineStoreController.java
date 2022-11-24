package com.skypro.online_store.controller;

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
    public List<Integer> getOrdersIds() {
        return onlineStoreService.getOrderIds();
    }

    @GetMapping("/order/add")
    public void addOrdersId(@RequestParam("id") List<Integer> ids) {
        onlineStoreService.addOrderIds(ids);
    }
}
