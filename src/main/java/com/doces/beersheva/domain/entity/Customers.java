package com.doces.beersheva.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customers {
    private String name;
    private String phoneNumber;
    private Address address;
}
