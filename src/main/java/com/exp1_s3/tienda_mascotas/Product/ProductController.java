package com.exp1_s3.tienda_mascotas.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/productos")
    public List<Product> getProducts() {
        return productService.getProducts();
    }    

}