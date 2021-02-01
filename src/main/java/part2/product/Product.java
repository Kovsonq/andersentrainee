package part2.product;

import lombok.Data;

@Data
public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
