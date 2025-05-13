package com.doces.beersheva.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
   private List<Product>products;
   private  Double productAmount;

}
