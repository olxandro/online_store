package com.skypro.online_store.service;

import com.skypro.online_store.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class OnlineStoreService {
    private Basket basket;

    public Basket addOrderIds(List<Integer> ids) {
        return basket = new Basket(ids);
    }

    public Basket getOrderIds() {
        return basket;
    }

}
