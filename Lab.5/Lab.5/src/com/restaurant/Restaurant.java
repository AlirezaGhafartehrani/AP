package com.restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant {

    private final ArrayList<Customer> currentCustomers;
    private String name;
    private int fund;
    private ArrayList<Food> foods;
    private ArrayList<Customer> customers;

    public Restaurant(String name, int fund) {
        this.name = name;
        this.fund = fund;
        customers = new ArrayList<>();
        currentCustomers = new ArrayList<>();
        this.numOrdered = new HashMap<>();
        this.foods = new ArrayList<>();
    }

    public HashMap<Food, Integer> numOrdered = new HashMap<>();

    public Restaurant(int fund) {
        this("JAVA Coffee house", fund);
    }

    public String getName() {
        return name;
    }

    public int getFund() {
        return fund;
    }

    public ArrayList<Food> getFoods() {
        ArrayList<Food> foodArrayList = new ArrayList<>();
        int size = foods.size();
        for (int i = 0; i < size; i++) {
            int max = 0;
            Food chosenFood = foods.get(0);
            for (Food food : foods){
                if (numOrdered.get(food) > max){
                    chosenFood = food;
                    max = numOrdered.get(food);
                }
            }
            foodArrayList.add(chosenFood);
            foods.remove(chosenFood);
        }
        foods = foodArrayList;
        return foodArrayList;
    }

    public void addFood(Food food){
        numOrdered.put(food, 0);
        foods.add(food);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Customer> getCurrentCustomers() {
        return currentCustomers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void prepareOrder(Order m) {
        int cost = 0;
        for (Food food : m.getFoods()) {
            int num = numOrdered.get(food);
            numOrdered.put(food, num + 1);
            cost += food.getPrice();
        }
        fund -= cost;
        currentCustomers.add(m.getCustomer());
    }

    public void acceptPayment(Customer customer) {
        int menuCost = customer.getOrder().getPrice();
        currentCustomers.remove(customer);
        fund += menuCost * 0.9;
        totalNumOfFood += customer.getOrder().getFoods().length;
    }

    private int totalNumOfFood = 0;

    public int getNumberOfFoodsDelivered(){
        return totalNumOfFood;
    }

    @Override
    public String toString() {
        String toReturn = "";
        toReturn += this.name + "\n";
        toReturn += this.fund + "\n";
        int totNumSold = 0;
        for (int num: numOrdered.values()) {
            totNumSold += num;
        }
        toReturn += currentCustomers.size() + "\n";
        toReturn += customers.size() + "\n";
        for (Food food: getFoods())
            toReturn += food + "\n";
        toReturn += totNumSold + "\n";
        return toReturn.trim();
    }
}
