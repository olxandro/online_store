package com.skypro.online_store.record;

public class OrderRequest {
    private int id;

    public OrderRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
