package com.exp1_s3.tienda_mascotas.ProductSale.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp1_s3.tienda_mascotas.ProductSale.model.ProductSaleModel;
import com.exp1_s3.tienda_mascotas.ProductSale.repository.ProductSaleRepository;

@Service
public class ProductSaleServiceImpl implements ProductSaleService {
    @Autowired
    private ProductSaleRepository productSaleRepository;

    @Override
    public List<ProductSaleModel> getSales() {
        return productSaleRepository.findAll();
    }

    @Override
    public double getSalesByDay(LocalDate date) {
        return productSaleRepository.findBySaleDate(date)
            .stream()
            .mapToDouble(ProductSaleModel::getTotal)
            .sum();
    }

    @Override
    public double getSalesByMonth(int year, int month) {
        return productSaleRepository.findByMonth(year, month)
            .stream()
            .mapToDouble(ProductSaleModel::getTotal)
            .sum();
    }

    @Override
    public double getSalesByYear(int year) {
        return productSaleRepository.findByYear(year)
            .stream()
            .mapToDouble(ProductSaleModel::getTotal)
            .sum();
    }

    @Override
    public ProductSaleModel createSale(ProductSaleModel sale) {
        return productSaleRepository.save(sale);
    }

    @Override
    public void deleteSale(int id) {
        productSaleRepository.deleteById(id);
    }

}
