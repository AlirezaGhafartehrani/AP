/** This Class display the characters of our foods
 * @author Parsa Divsalar
 * @version 1.0
 * @since 2019-04-20
 */
public class Food {

    /** @param name of the food
     */
    private String foodName;
    /** @param price of the food
     */
    private float foodPrice;

    /**
     *
     * @param name initialize the name of our food
     * @param price initialize the name of our food
     */
    public Food (String name , float price){
        foodName = name;
        foodPrice = price;
    }

    /**
     *
     * @return foodname
     */
    public String getFoodName (){
        return foodName;
    }

    /**
     *
     * @param foodPrice set foodprice
     */
    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    /**
     *
     * @return food price
     */
    public float getFoodPrice() {
        return foodPrice;
    }
}
