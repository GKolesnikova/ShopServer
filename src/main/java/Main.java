import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Kase");
        Product product2 = new Product(2, "Milch");
        Product product3 = new Product(3, "Brot");
        Product product4 = new Product(4, "Butter");
        System.out.println(product1);


        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        Order order = new Order(1, products);


        OrderRepo orderRepo = new OrderRepo();
        orderRepo.addOrderProduct(order);
        System.out.println(orderRepo);


        Map<Integer, Product> productsSet = new HashMap<>();
        ProductRepo productepo = new ProductRepo (productsSet);


        ShopService shopService = new ShopService(productepo, orderRepo);
        System.out.println(" *** ");
        System.out.println( shopService.getProduct(3));

        System.out.println(" *** ");
        System.out.println( shopService.listProducts());

        System.out.println(" *** ");
        System.out.println( shopService.addOrder(order));

        System.out.println(" *** ");
        System.out.println( shopService.getOrder(2));

        System.out.println(" *** ");
        System.out.println( shopService.listOrder());









    }


}
