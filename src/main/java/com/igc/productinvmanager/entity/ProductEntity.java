package com.igc.productinvmanager.entity;

import com.igc.productinvmanager.model.ProductModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private int price;
    private int quantity;
    private String status;

    public ProductEntity(ProductModel productModel) {
        this.name = productModel.getName();
        this.description = productModel.getDescription();
        this.price = productModel.getPrice();
        this.quantity = productModel.getQuantity();
        this.status = productModel.getStatus();
    }
}
