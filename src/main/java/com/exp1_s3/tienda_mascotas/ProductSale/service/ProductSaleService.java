package com.exp1_s3.tienda_mascotas.ProductSale.service;

import java.time.LocalDate;
import java.util.List;

import com.exp1_s3.tienda_mascotas.ProductSale.model.ProductSaleModel;

public interface ProductSaleService {
    public List<ProductSaleModel> getSales(); 
    public double getSalesByDay(LocalDate date);
    public double getSalesByMonth(int year, int month);
    public double getSalesByYear(int year);
    public ProductSaleModel createSale(ProductSaleModel sale);
    public void deleteSale(int id);
}