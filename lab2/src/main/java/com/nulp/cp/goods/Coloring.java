package com.nulp.cp.goods;

import com.nulp.cp.enums.Category;
import com.nulp.cp.enums.Theme;

public class Coloring extends Good {
    private Theme theme;

    public Coloring(String name, int price, Category category, int pagesAmount, double weight, Theme theme) {
        super(name, price, category, pagesAmount, weight);
        this.theme = theme;
    }

    public Coloring(String name, int price, Category category, double weight, Theme theme) {
        super(name, price, category, weight);
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Coloring{" +
                " name ='" + name + '\'' +
                ", price =" + price +
                ", pagesAmount =" + pagesAmount +
                ", category =" + category +
                ", weight =" + weight +
                ", theme =" + theme +
                '}';
    }
}
