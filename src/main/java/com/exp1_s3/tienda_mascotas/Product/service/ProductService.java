package com.exp1_s3.tienda_mascotas.Product.service;

import java.util.List;

import com.exp1_s3.tienda_mascotas.Product.model.ProductModel;

public interface ProductService {
    public List<ProductModel> getAllProducts();
    public ProductModel createProduct(ProductModel product);
}
