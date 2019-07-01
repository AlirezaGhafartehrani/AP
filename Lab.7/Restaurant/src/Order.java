import java.util.*;

public class Order {

    private Food food ;
    private int numberOfOrders;
    private String details;

    public Order (String name ,float price , int number , String details ){
        food = new Food(name , price);
        numberOfOrders = number;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public String getFoodName() {
        return food.getFoodName();
    }

}


