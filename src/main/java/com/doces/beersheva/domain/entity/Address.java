package com.doces.beersheva.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    private String postalCode;
    private String street;
    private String number;
    private String complement;
    private String district;


    @Override
    public String toString() {
        return "Endereço{ " +
                "Rua: '" + street + '\'' +
                ", número:'" + number + '\'' +
                ", complemento: '" + complement + '\'' +
                ", Bairro:'" + district + '\'' +
                ", CEP:'" + postalCode + '\'' +
                '}';
    }
}
