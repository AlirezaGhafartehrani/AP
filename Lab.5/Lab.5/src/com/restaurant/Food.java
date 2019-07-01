package com.restaurant;

import java.util.ArrayList;

public class Food {

    private int id;
    private String name;
    private int price;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Integer> ingredientsAmount;

    public Food (int id, String name) {
        this.id = id;
        this.name = name;
        price = 0;
        ingredients = new ArrayList<Ingredient>();
        ingredientsAmount = new ArrayList<Integer>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }


    public void addIngredient(Ingredient ingredient, int amount) {
        ingredients.add(ingredient);
        ingredientsAmount.add(amount);
        price += amount * ingredient.getPrice();
    }

    @Override
    public String toString() {
        return this.name;
    }
}

