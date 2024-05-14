package pro.sky.spring_core.service;

import java.util.List;

public interface ShoppingService {
    List<Integer> getAllProduct();

    void add(List<Integer> product);
}
