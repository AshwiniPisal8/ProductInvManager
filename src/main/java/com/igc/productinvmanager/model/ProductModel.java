package com.igc.productinvmanager.model;

import lombok.Data;

@Data
public class ProductModel {
    private String name;
    private String description;
    private Integer price;
    private Integer quantity;
    private String status;
}
