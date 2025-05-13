package com.doces.beersheva.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Customers client;
    private List<OrderItem> itens;
    private Double totalAmount;
}
