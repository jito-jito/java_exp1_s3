package com.exp1_s3.tienda_mascotas.ProductSale;

import java.time.LocalDate;

public class ProductSale {
    private int id;
    private String name;
    private int price;
    private int amount;
    private String description;
    private LocalDate date;

    public ProductSale(int id, String name, int price, int amount, String description, LocalDate date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    public double getTotal() {
        return price * amount;
    }
}
