package pro.sky.spring_core.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.spring_core.repository.ShoppingCartDAO;
import pro.sky.spring_core.service.ShoppingService;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private final ShoppingCartDAO repository;

    public ShoppingServiceImpl(ShoppingCartDAO repository) {
        this.repository = repository;
    }

    @Override
    public List<Integer> getAllProduct() {
        return repository.getAllProduct();
    }

    @Override
    public void add(List<Integer> product) {
        repository.addProduct(product);
    }
}
