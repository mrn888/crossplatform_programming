package com.nulp.cp.goods;

import com.nulp.cp.enums.Category;

import java.util.Collection;

public abstract class Good {
    protected String name;
    protected int price;
    protected int pagesAmount = 1;
    protected Category category;
    protected double weight;

    public Good(String name, int price, Category category, int pagesAmount, double weight) {
        this.name = name;
        this.price = price;
        this.pagesAmount = pagesAmount;
        this.category = category;
        this.weight = weight;
    }

    public Good(String name, int price, Category category,  double weight) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pagesAmount=" + pagesAmount +
                ", category=" + category +
                ", weight=" + weight +
                '}';
    }

    public Category getCategories() {
        return category;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
