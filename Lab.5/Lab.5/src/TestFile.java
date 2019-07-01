import com.restaurant.*;

public class TestFile {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Java AP Lab",3000);
        Ingredient i1 = new Ingredient(1, "carrot", 20);
        Ingredient i2 = new Ingredient(2, "meat", 50);
        Ingredient i3 = new Ingredient(3, "bread", 10);
        Ingredient i4 = new Ingredient(4, "potato", 20);
        Ingredient i5 = new Ingredient(4, "onion", 30);
        Food f1 = new Food(1, "ab-goosht");
        f1.addIngredient(i3, 2);
        f1.addIngredient(i1, 1);
        f1.addIngredient(i2, 1);
        f1.addIngredient(i4, 1);
        restaurant.addFood(f1);
        Food f2 = new Food(2, "kabab");
        f2.addIngredient(i2, 4);
        f2.addIngredient(i5, 5);
        restaurant.addFood(f2);
        Customer customer = new Customer(1, "gholi");
        restaurant.addCustomer(customer);
        Food[] foods = new Food[]{f1, f1};
        Order order1 = new Order(1, customer, foods);
        order1.addFood(f1, 2);
        restaurant.prepareOrder(order1);
        restaurant.acceptPayment(customer);
        System.out.println(restaurant.getFund());
        System.out.println(restaurant.getNumberOfFoodsDelivered());
    }
}
