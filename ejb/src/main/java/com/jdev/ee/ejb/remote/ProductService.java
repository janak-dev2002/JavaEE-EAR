package com.jdev.ee.ejb.remote;


import com.jdev.ee.core.model.Product;
import jakarta.ejb.Remote;

import java.util.List;

@Remote
public interface ProductService {

    Product getProduct(int id);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> getProducts();


}
