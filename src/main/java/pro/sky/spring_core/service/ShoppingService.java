package pro.sky.spring_core.service;

import pro.sky.spring_core.model.Product;

import java.util.List;

public interface ShoppingService {
    List<Product> getAllProduct();

    void add(Product product);
}
