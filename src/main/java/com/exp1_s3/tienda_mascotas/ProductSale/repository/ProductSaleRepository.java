package com.exp1_s3.tienda_mascotas.ProductSale.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exp1_s3.tienda_mascotas.ProductSale.model.ProductSaleModel;


public interface ProductSaleRepository extends JpaRepository<ProductSaleModel, Integer> {
  // Derivado por nombre de PROPIEDAD
  List<ProductSaleModel> findBySaleDate(LocalDate saleDate);

  @Query(value = "SELECT * FROM VENTAS_PRODUCTOS p " +
                "WHERE EXTRACT(YEAR  FROM p.SALE_DATE) = :year",
        nativeQuery = true)
  List<ProductSaleModel> findByYear(@Param("year") int year);

  @Query(value = "SELECT * FROM VENTAS_PRODUCTOS p " +
                "WHERE EXTRACT(YEAR  FROM p.SALE_DATE) = :year " +
                "AND   EXTRACT(MONTH FROM p.SALE_DATE) = :month",
        nativeQuery = true)
  List<ProductSaleModel> findByMonth(@Param("year") int year, @Param("month") int month);
}
