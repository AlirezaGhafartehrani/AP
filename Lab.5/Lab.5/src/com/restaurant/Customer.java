package com.restaurant;

public class Customer {
    private int id;
    private String name;
    private Order order;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

