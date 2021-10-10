package com.nulp.cp.utils;


import com.nulp.cp.goods.Good;

import java.util.*;

public class GoodsList implements List<Good> {

    private Good[] array;

    private int size;

    private int capacity;

    static private final int DEFAULT_CAPACITY = 10;

    public GoodsList(){
        capacity = DEFAULT_CAPACITY;
        array = new Good[capacity];
        size = 0;
    }

    GoodsList(int capacity){
        if(capacity>0) {
            this.capacity = capacity;
        }else{
            this.capacity = DEFAULT_CAPACITY;
        }
        array = new Good[this.capacity];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            array[i] = null;
        size = 0;
    }

    @Override
    public Iterator<Good> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Good> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size;
        }

        @Override
        public Good next() {
            if(hasNext()){
                return array[current++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    @Override
    public Good get(int index) {
        return array[index];
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (array[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(array[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public boolean add(Good o) {
        if(size<capacity){
            array[size++] = o;
        }else{
            Good[] tempArray = array;
            capacity *= 2;
            array = new Good[capacity];
            for(int i = 0;i<tempArray.length;i++){
                array[i] = tempArray[i];
            }
            array[size++] = o;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        for(i = 0; i < size-1; i++){
            stringBuilder.append(array[i].toString());
            stringBuilder.append("\n");
        }

        stringBuilder.append(array[size-1]);
        return stringBuilder.toString();
    }

    @Override
    public void sort(Comparator<? super Good> c) {
        Arrays.sort(array, 0, size, c);
    }

    @Override
    public Good remove(int index) {
        Good deleted = array[index];
        if (size > 0) {
            for (int i = index; i < size-1; i++) {
                array[i] = array[i+1];
            }
        }
        size--;
        return deleted;
    }

    @Override
    public boolean remove(Object o) {
        throw new NoSuchMethodError();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new NoSuchMethodError();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new NoSuchMethodError();
    }

    @Override
    public Good set(int index, Good element) { throw new NoSuchMethodError(); }

    @Override
    public void add(int index, Good element) { throw new NoSuchMethodError(); }

    @Override
    public int lastIndexOf(Object o) {
        throw new NoSuchMethodError();
    }

    @Override
    public ListIterator listIterator() {
        throw new NoSuchMethodError();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new NoSuchMethodError();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new NoSuchMethodError();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new NoSuchMethodError();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new NoSuchMethodError();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new NoSuchMethodError();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new NoSuchMethodError();
    }

    @Override
    public Object[] toArray() {
        throw new NoSuchMethodError();
    }


}

