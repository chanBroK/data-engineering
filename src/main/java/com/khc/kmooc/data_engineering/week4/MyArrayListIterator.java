package com.khc.kmooc.data_engineering.week4;

import java.util.Iterator;

public class MyArrayListIterator<E> implements Iterator<E> {
    private final Object[] data;
    private int cursor;

    public MyArrayListIterator(Object[] data) {
        this.data = data;
        this.cursor = -1;
    }

    @Override
    public boolean hasNext() {
        return cursor + 1 < this.data.length;
    }

    @Override
    public E next() {
        return (E) this.data[++this.cursor];
    }

    @Override
    public void remove() {

    }
}
