package com.exp1_s3.tienda_mascotas.ProductSale;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSaleController {
    private final ProductSaleService productSaleService;

    public ProductSaleController(ProductSaleService productSaleService) {
        this.productSaleService = productSaleService;
    }


    @GetMapping("/ventas")
    public List<ProductSale> getSales() {
        return productSaleService.getProductSales();
    }

    @GetMapping("/ventas/dia")
    public double getSalesByDay(@RequestParam("fecha") String date) {
        return productSaleService.getSalesByDay(LocalDate.parse(date));
    }

    @GetMapping("/ventas/mes")
    public double getSalesByMonth(@RequestParam("ano") int year, @RequestParam("mes") int month) {
        return productSaleService.getSalesByMonth(year, month);
    }

    @GetMapping("/ventas/anual")
    public double getSalesByYear(@RequestParam("ano") int year) {
        return productSaleService.getSalesByYear(year);
    }

}
