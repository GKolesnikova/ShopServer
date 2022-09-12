package repo;
import model.Product;

import java.util.*;

public class ProductRepo{


    private Map<Integer, Product> products = new HashMap<>();

    public ProductRepo(Map<Integer, Product> products) {
        this.products = products;
    }

    public Product getProduct(Integer id) throws Exception {
        if ( !id.equals(products.get(id))) {
            throw new Exception("The program was urgently stopped");
        }
        return products.get(id) ;
    }

    public List<Product> listProducts() {
        ArrayList<Product> neueListProducts = new ArrayList<>(products.values());
        return neueListProducts;
    }



}
