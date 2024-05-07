package pro.sky.spring_core.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.spring_core.model.Product;
import pro.sky.spring_core.service.ShoppingService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingController {

    private final ShoppingService service;

    public ShoppingController(ShoppingService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public List<Product> getAllProduct() {
        return service.getAllProduct();
    }

    @GetMapping("/add")
    public Product addProduct(@RequestParam("id") List<Integer> id) {
        Product product = new Product(id);
        service.add(product);
        return product;
    }
}
