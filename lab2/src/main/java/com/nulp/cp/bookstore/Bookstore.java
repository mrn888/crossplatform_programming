package com.nulp.cp.bookstore;

import com.nulp.cp.enums.Category;
import com.nulp.cp.enums.Genre;
import com.nulp.cp.enums.Theme;
import com.nulp.cp.goods.Book;
import com.nulp.cp.goods.Calendar;
import com.nulp.cp.goods.Coloring;
import com.nulp.cp.goods.Good;
import com.nulp.cp.utils.GoodsList;

public class Bookstore {
    GoodsList goods;

    public void createStore() {
        Good i1 = new Book("Murder on the Orient Express", 190, Category.ADULTS, 354,
                400.0, "Agatha Christie", Genre.DETECTIVE);

        Good i2 = new Book("Alphabet", 200, Category.KIDS,
                300.0, "Saints Cyril and Methodius", Genre.EDUCATIONAL);

        Good i3 = new Calendar("Orthodox calendar",65, Category.OLD, 100.0,  2022);

        Good i4 = new Coloring("Black Widow",150, Category.TEENAGERS, 10,
                200.0, Theme.MARVEL);

        goods = new GoodsList();
        goods.add(i1);
        goods.add(i2);
        goods.add(i3);
        goods.add(i4);
    }

    public void runStore() {
        StoreManager manager = new StoreManager(goods);

        System.out.println("\nAll goods: ");
        System.out.println(goods);

        System.out.println("\nSorted by price (with inner class): ");
        manager.sortByPrice( false);
        System.out.println(goods);

        System.out.println("\nSorted by name (with static inner class): ");
        manager.sortByName(true);
        System.out.println(goods);

        System.out.println("\nSorted by weight (with anonymous class): ");
        manager.sortByWeight(false);
        System.out.println(goods);

        System.out.println("\nSorted by amount of pages (with lambda): ");
        manager.sortByPagesAmount(false);
        System.out.println(goods);

        System.out.println("\nAll books with genre \"DETECTIVE\": ");
        System.out.println(manager.findByGenre(Genre.DETECTIVE));

        System.out.println("\nAll goods with category \"OLD\": ");
        System.out.println(manager.findByCategory(Category.OLD));
    }

}
