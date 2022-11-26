package com.skypro.online_store.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OnlineStoreService {
    private final List<Integer> idsOrder = new ArrayList<>();

    public void addOrderIds(List<Integer> ids) {
        idsOrder.addAll(ids);
    }

    public List<Integer> getOrderIds() {
        return idsOrder;
    }

}
