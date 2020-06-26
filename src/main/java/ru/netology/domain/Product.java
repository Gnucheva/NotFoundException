package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private int id;
    private String name;
    private int price;

    public boolean matches(String search) {
        return name.equals(search);
    }


}

