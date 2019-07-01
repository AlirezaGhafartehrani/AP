package com.restaurant;

public class Order {
    private int id;
    private Customer customer;
    private Food[] foods;
    private int price;

    public Order(int id, Customer customer, Food[] foods) {
        this.id = id;
        this.customer = customer;
        this.foods = foods;

        for (Food food : foods) {
            price += food.getPrice();
        }
        price *= 1.4;
        customer.setOrder(this);
    }

    public Food[] getFoods() {
        return foods;
    }

    public int getPrice() {
        return price;
    }

    public void addFood(Food food, int amount){
        Food[] temp = new Food[foods.length + amount];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = 0; i < amount; i++) {
            temp[foods.length + i] = food;
        }
        foods = temp;
        temp = null;

            price += amount * food.getPrice() * 1.4;


    }

    public Customer getCustomer() {
        return customer;
    }

}
