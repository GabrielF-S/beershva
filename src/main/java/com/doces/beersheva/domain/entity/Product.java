package com.doces.beersheva.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private String taste;
    private String description;
    private Double unitAmount;
    private ProductCategory productCategory;

}
