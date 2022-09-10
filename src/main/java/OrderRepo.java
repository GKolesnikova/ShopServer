import java.util.*;

public class OrderRepo {

    private Map<Integer, Order> orders = new HashMap<>();

    public OrderRepo() {
        this.orders = orders;
    }

    public List<Order> listOrderProducts() {
        ArrayList<Order> neueOrderListProducts = new ArrayList<>(orders.values());
        return neueOrderListProducts;
    }

    public Order getOrderProduct(Integer id) {
        return orders.get(id) ;
    }

    public Order addOrderProduct(Order order) {
        return orders.put(order.getId(), order);
    }
}
