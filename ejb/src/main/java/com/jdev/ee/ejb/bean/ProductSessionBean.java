package com.jdev.ee.ejb.bean;

import com.jdev.ee.core.model.Product;
import com.jdev.ee.ejb.remote.ProductService;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class ProductSessionBean implements ProductService {


    @Override
    public Product getProduct(int id) {
        return new Product(1, "Product 1", 10.0, "Description 1", 100);
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public List<Product> getProducts() {
        return List.of(
                new Product(1, "Product 1", 10.0, "Description 1", 100),
                new Product(2, "Product 2", 20.0, "Description 2", 200),
                new Product(3, "Product 3", 30.0, "Description 3", 300),
                new Product(4, "Product 4", 40.0, "Description 4", 400)
        );
    }
}
