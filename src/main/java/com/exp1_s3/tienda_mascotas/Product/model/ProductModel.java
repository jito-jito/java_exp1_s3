package com.exp1_s3.tienda_mascotas.Product.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class ProductModel {
    @Id
    private int id;
    private String name;
    private int price;
    private int stock;
    private String description;

    public ProductModel() {
        // Default constructor required by JPA
    }

    public ProductModel(int id, String name, int price, int stock, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
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
