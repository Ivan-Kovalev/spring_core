package pro.sky.spring_core.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.spring_core.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ShoppingCartDAO {

    private final List<Product> SHOPPING_CART = new ArrayList<>();

    public List<Product> getAllProduct() {
        return SHOPPING_CART;
    }

    public void addProduct(Product product) {
        SHOPPING_CART.add(product);
    }
}
