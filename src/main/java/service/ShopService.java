package service;
import model.Order;
import model.Product;
import repo.OrderRepo;
import repo.ProductRepo;
import java.util.List;

public class ShopService {

        private ProductRepo productRepo;
        private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Product getProduct (Integer id) {
            return productRepo.getProduct(id);
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
