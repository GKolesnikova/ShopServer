import java.util.*;

public class ProductRepo extends Product {


    Map<Integer, String> products = new HashMap<>();

    public ProductRepo(Map<Integer, String> products) {
        super();
        this.products = products;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }


    //get();

    //list();




}
