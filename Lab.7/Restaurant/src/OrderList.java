import java.util.ArrayList;

public class OrderList {

    private ArrayList<Order> orders;
    private Table table;
    private Garson garson;
    private Time time;
    private float totalPrice;

    public OrderList(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public OrderList(Table table) {
        this.table = table;
    }

    public OrderList(Garson garson) {
        this.garson = garson;
    }

    public OrderList(Time time) {
        this.time = time;
    }

    public OrderList(float totalPrice) {
        this.totalPrice = totalPrice;
    }


}
