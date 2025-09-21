package com.exp1_s3.tienda_mascotas.ProductSale.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "VENTAS_PRODUCTOS")
public class ProductSaleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private int amount;
    private String description;
    @Column(name = "SALE_DATE") 
    private LocalDate saleDate;

    public ProductSaleModel() {
    }

    public ProductSaleModel(int id, String name, int price, int amount, String description, LocalDate saleDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.saleDate = saleDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    @Transient
    public double getTotal() {
        return price * amount;
    }
}
