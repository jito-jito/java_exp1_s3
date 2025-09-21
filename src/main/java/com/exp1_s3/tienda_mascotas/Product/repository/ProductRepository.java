package com.exp1_s3.tienda_mascotas.Product.repository;
import com.exp1_s3.tienda_mascotas.Product.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}
