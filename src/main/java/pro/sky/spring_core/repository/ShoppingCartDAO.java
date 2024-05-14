package pro.sky.spring_core.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ShoppingCartDAO {

    private final List<Integer> SHOPPING_CART = new ArrayList<>();

    public List<Integer> getAllProduct() {
        return SHOPPING_CART;
    }

    public void addProduct(List<Integer> product) {
        SHOPPING_CART.addAll(product);
    }
}
