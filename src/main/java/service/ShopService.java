package service;
import model.Order;
import model.Product;
import repo.OrderRepo;
import repo.ProductRepo;
import java.util.List;

public class ShopService {

        private static ProductRepo productRepo;
        private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public static Product getProduct(Integer id){
            try {
                return productRepo.getProduct(id);}
            catch (Exception ex) {
                System.out.println("You entered an incorrect product id, please enter a different id.");
            }
        return null;
    }

        public List<Product> listProducts () {
            return productRepo.listProducts();
        }

        public Order addOrder (Order order) {
            return orderRepo.addOrderProduct(order);
        }

        public Order getOrder (Integer id) {
            return orderRepo.getOrderProduct(id);
        }

        public List<Order> listOrder () {
            return orderRepo.listOrderProducts();
        }






}
