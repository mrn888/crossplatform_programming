package com.nulp.cp.demo;

import com.nulp.cp.bookstore.Bookstore;

public class Main {
    public static void main(String[] args) {
        Bookstore store = new Bookstore();
        store.createStore();
        store.runStore();
    }
}
