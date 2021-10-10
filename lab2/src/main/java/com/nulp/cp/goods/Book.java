package com.nulp.cp.goods;

import com.nulp.cp.enums.Category;
import com.nulp.cp.enums.Genre;

public class Book extends Good {
    private String author;
    private Genre genre;

    public Book(String name, int price, Category category, int pagesAmount, double weight, String author, Genre genre) {
        super(name, price, category, pagesAmount, weight);
        this.author = author;
        this.genre = genre;
    }

    public Book(String name, int price, Category category, double weight, String author, Genre genre) {
        super(name, price, category, weight);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                " name ='" + name + '\'' +
                ", price =" + price +
                ", pagesAmount =" + pagesAmount +
                ", category =" + category +
                ", weight =" + weight +
                ", author ='" + author + '\'' +
                ", genre =" + genre +
                '}';
    }

    public Genre getGenre() {
        return genre;
    }
}
