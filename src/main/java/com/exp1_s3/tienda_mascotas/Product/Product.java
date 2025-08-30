package com.exp1_s3.tienda_mascotas.Product;

public class Product {
    private int id;
    private String name;
    private int price;
    private int stock;
    private String description;

    public Product(int id, String name, int price, int stock, String description) {
        this.id = id;
        this.name = name;
        this.price =price;
        this.stock = stock;
        this.description = description;
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

    public int getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }
}
