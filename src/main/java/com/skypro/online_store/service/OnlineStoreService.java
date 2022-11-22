package com.skypro.online_store.service;

import com.skypro.online_store.model.Order;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope("prototype")
public class OnlineStoreService {
    private final List<Order> orderList = new ArrayList<>();

    public void addOrder(Integer[] integers) {
        for (Integer i :
             integers) {
            orderList.add(new Order(i));
        }
    }

    public List<Integer> getOrderId() {
        List<Integer> result = new ArrayList<>();
        for (Order order:
             orderList) {
            result.add(order.getId());
        }
        return result;
    }

}
