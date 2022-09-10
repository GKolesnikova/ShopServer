import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Kase");
        Product product2 = new Product(2, "Milch");
        Product product3 = new Product(3, "Brot");
        Product product4 = new Product(4, "Butter");

        System.out.println(product1);



        ArrayList<Order> orderProduct1 = new ArrayList<>();
        orderProduct1.add(1, product1);
        orderProduct1.add(product2);
        orderProduct1.add(product3);

        System.out.println(orderProduct1);


        OrderRepo orderProduct = new OrderRepo();
        orderProduct.addOrderProduct(orderProduct1);








    }


}
