package com.exp1_s3.tienda_mascotas.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp1_s3.tienda_mascotas.Product.model.ProductModel;
import com.exp1_s3.tienda_mascotas.Product.service.ProductService;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/productos")
    public List<ProductModel> getProducts() {
        return productService.getAllProducts();
    }    

    @PostMapping("/productos")
    public ProductModel createProduct(@RequestBody ProductModel product) {
        return productService.createProduct(product);
    }
    
}