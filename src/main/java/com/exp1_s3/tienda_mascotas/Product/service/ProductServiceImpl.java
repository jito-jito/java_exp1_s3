package com.exp1_s3.tienda_mascotas.Product.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exp1_s3.tienda_mascotas.Product.model.ProductModel;
import com.exp1_s3.tienda_mascotas.Product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductModel createProduct(ProductModel product) {
        return productRepository.save(product);
    }

}