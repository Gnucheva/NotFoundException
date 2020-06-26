package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class TShirt extends Product {
    private String color;
    private String size;

    public TShirt(int id, String name, int price, String color, String size) {
        super(id, name, price);
        this.color = color;
        this.size = size;

    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || color.equals(search);
    }


}
