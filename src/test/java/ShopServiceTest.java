import model.Product;
import org.junit.jupiter.api.Test;
import repo.ProductRepo;
import service.ShopService;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShopServiceTest {


    @Test
    void ShopServiceForGetProduct() {
        // GIVEN
        Product product1 = new Product(1, "Kase");
        Map<Integer, Product> products = new HashMap<>();
        products.put(product1.getId(), product1);

        // WHEN
        model.Product actual = ShopService.getProduct(1);

        // THEN
        assertEquals("Kase", actual);


    }


}
