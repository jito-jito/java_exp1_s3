package com.exp1_s3.tienda_mascotas.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Alimento para perro", 35000, 20, "Bolsa de 10kg de alimento premium para perros adultos"));
        products.add(new Product(2, "Arena para gato", 15000, 35, "Arena absorbente y sin olor para gatos, saco de 5kg"));
        products.add(new Product(3, "Jaula para hámster", 45000, 10, "Jaula espaciosa con rueda y accesorios incluidos"));
        products.add(new Product(4, "Pecera de vidrio", 80000, 5, "Pecera de 40 litros con tapa y filtro incluido"));
        products.add(new Product(5, "Collar para perro", 12000, 50, "Collar ajustable de nylon, disponible en varios colores"));
        products.add(new Product(6, "Rascador para gato", 60000, 8, "Rascador con plataforma para gatos pequeños y medianos"));
        products.add(new Product(7, "Vitamina para aves", 10000, 40, "Suplemento vitamínico líquido para aves de compañía"));
        products.add(new Product(8, "Transportadora para mascotas", 70000, 6, "Caja transportadora de plástico resistente para perros y gatos"));
    }

    public List<Product> getProducts() {
        return products;
    }

}
