package pro.sky.spring_core.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.spring_core.service.ShoppingService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingController {

    private final ShoppingService service;

    public ShoppingController(ShoppingService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public List<Integer> getAllProduct() {
        return service.getAllProduct();
    }

    @GetMapping("/add")
    public List<Integer> addProduct(@RequestParam("id") List<Integer> id) {
        List<Integer> product = new ArrayList<>(id);
        service.add(product);
        return product;
    }
}
