package com.nulp.cp.goods;

import com.nulp.cp.enums.Category;

public class Calendar extends Good {
    private int year;

    public Calendar(String name, int price, Category category, int pagesAmount, double weight, int year) {
        super(name, price, category, pagesAmount, weight);
        this.year = year;
    }

    public Calendar(String name, int price, Category category, double weight, int year) {
        super(name, price, category, weight);
        this.year = year;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                " name ='" + name + '\'' +
                ", price =" + price +
                ", pagesAmount =" + pagesAmount +
                ", category =" + category +
                ", weight =" + weight +
                ", year =" + year +
                '}';
    }

    public int getYear() {
        return year;
    }
}
