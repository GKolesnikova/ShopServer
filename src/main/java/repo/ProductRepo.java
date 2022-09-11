package repo;
import model.Product;

import java.util.*;

public class ProductRepo{


    private Map<Integer, Product> products = new HashMap<>();

    public ProductRepo(Map<Integer, Product> products) {
        this.products = products;
    }

    public Product getProduct(Integer id) {
        return products.get(id) ;
    }

    public List<Product> listProducts() {
        ArrayList<Product> neueListProducts = new ArrayList<>(products.values());
        return neueListProducts;
    }



}
