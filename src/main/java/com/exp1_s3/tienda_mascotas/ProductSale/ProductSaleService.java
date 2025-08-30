package com.exp1_s3.tienda_mascotas.ProductSale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductSaleService {
    private List<ProductSale> productSales = new ArrayList<>();
 
    public ProductSaleService() {
        productSales.add(new ProductSale(1, "Alimento para perro", 35000, 2, "Compra de 2 bolsas de alimento premium", LocalDate.of(2025, 1, 1)));
        productSales.add(new ProductSale(2, "Arena para gato", 15000, 3, "Arena para gato, paquete de 3 sacos", LocalDate.of(2025, 8, 2)));
        productSales.add(new ProductSale(3, "Jaula para hámster", 45000, 1, "Jaula completa para hámster con accesorios", LocalDate.of(2025, 8, 3)));
        productSales.add(new ProductSale(4, "Pecera de vidrio", 80000, 1, "Pecera de 40 litros para peces tropicales", LocalDate.of(2025, 8, 5)));
        productSales.add(new ProductSale(5, "Collar para perro", 12000, 4, "Collares de colores surtidos para perro", LocalDate.of(2025, 1, 6)));
        productSales.add(new ProductSale(6, "Rascador para gato", 60000, 1, "Rascador para gato mediano", LocalDate.of(2025, 11, 8)));
        productSales.add(new ProductSale(7, "Vitamina para aves", 10000, 5, "Vitaminas para aves en presentación de 100 ml", LocalDate.of(2025, 4, 9)));
        productSales.add(new ProductSale(8, "Transportadora para mascotas", 70000, 1, "Transportadora plástica tamaño mediano", LocalDate.of(2025, 8, 10)));
    }

    public List<ProductSale> getProductSales() {
        return productSales;
    }

    public double getSalesByDay(LocalDate date) {
    return productSales.stream()
            .filter(sale -> sale.getDate().equals(date))
            .mapToDouble(ProductSale::getTotal)
            .sum();
    }

    public double getSalesByMonth(int year, int month) {
    return productSales.stream()
            .filter(sale -> sale.getDate().getYear() == year && sale.getDate().getMonthValue() == month)
            .mapToDouble(ProductSale::getTotal)
            .sum();
    }

    public double getSalesByYear(int year) {
    return productSales.stream()
            .filter(sale -> sale.getDate().getYear() == year)
            .mapToDouble(ProductSale::getTotal)
            .sum();
    }
}

