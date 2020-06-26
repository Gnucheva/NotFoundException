package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Book extends Product {
    private String author;
    private int pages;
    private int publishedYear;

    public Book(int id, String name, int price, String author, int pages, int publishedYear) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || author.equals(search);
    }

}
