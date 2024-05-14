package pro.sky.spring_core.model;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private List<Integer> id;

    public Product(List<Integer> id) {
        this.id = id;
    }
}
