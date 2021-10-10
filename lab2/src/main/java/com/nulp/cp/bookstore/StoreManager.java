package com.nulp.cp.bookstore;

import com.nulp.cp.enums.Category;
import com.nulp.cp.enums.Genre;
import com.nulp.cp.goods.Book;
import com.nulp.cp.goods.Good;
import com.nulp.cp.utils.GoodsList;

import java.util.Comparator;

public class StoreManager {

    private GoodsList list;

    public StoreManager(GoodsList list) {
        this.list = list;
    }

    public GoodsList findByGenre(Genre genre){
        GoodsList result = new GoodsList();
        for(Good item: list){
            if(item.getClass() == Book.class){
                if(((Book) item).getGenre()  == genre)
                    result.add(item);
            }
        }
        return result;
    }

    public GoodsList findByCategory(Category category){
        GoodsList result = new GoodsList();
        for(Good item: list){
            if(item.getCategories().equals(category))
                result.add(item);
        }
        return result;
    }

    //sort with inner comparator
    public void sortByPrice(boolean isOrderAsc) {
        sort(new PriceComparator(), isOrderAsc);
    }

    // sort with static inner comparator
    public void sortByName(boolean isOrderAsc) {
        sort(new NameComparator(), isOrderAsc);
    }

    // sort with lambda
    public void sortByPagesAmount(boolean isOrderAsc) {
        sort((o1, o2) -> Integer.compare(o1.getPagesAmount(), o2.getPagesAmount()), isOrderAsc);
    }

    // sort with anonymous inner comparator
    public void sortByWeight(boolean isOrderAsc) {
        sort(new Comparator<Good>() {

            @Override
            public int compare(Good o1, Good o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }

        }, isOrderAsc);
    }

    private void sort(Comparator<Good> comparator, boolean isOrderAsc) {
        if (isOrderAsc) list.sort(comparator);
        else list.sort(comparator.reversed());
    }

    // comparator implemented like inner class
    private class PriceComparator implements Comparator<Good>{
        @Override
        public int compare(Good o1, Good o2) {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
    }

    // comparator implemented like static inner class
    private static class NameComparator implements Comparator<Good>{
        @Override
        public int compare(Good o1, Good o2) {
            String obj1 = o1.getName();
            String obj2 = o2.getName();
            if (obj1 == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj1.equals(obj2)) {
                return 0;
            }
            return obj1.compareTo(obj2);
        }
    }

}
