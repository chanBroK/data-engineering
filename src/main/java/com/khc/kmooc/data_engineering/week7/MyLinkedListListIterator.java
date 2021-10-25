package com.khc.kmooc.data_engineering.week7;

import java.util.ListIterator;

public class MyLinkedListListIterator<E> implements ListIterator<E> {
    private final MyLinkedList<E> data;
    private int cursor;
    private MyNode<E> lastReturned;

    public MyLinkedListListIterator(MyLinkedList<E> data, int index) {
        this.data = data;
        this.cursor = index - 1;
    }

    @Override
    public boolean hasNext() {
        return cursor + 1 < this.data.size();
    }

    @Override
    public E next() {
        this.lastReturned = this.data.getNode(++this.cursor);
        return this.lastReturned.getItem();
    }

    @Override
    public boolean hasPrevious() {
        return this.cursor >= 0;
    }

    @Override
    public E previous() {
        this.lastReturned = this.data.getNode(this.cursor--);
        return this.lastReturned.getItem();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(E e) {

    }

    @Override
    public void add(E e) {

    }
}
