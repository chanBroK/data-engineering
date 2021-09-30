package kr.kmooc.dataEngineering.homework1;

import java.util.ListIterator;

public class MyArrayListListIterator<E> implements ListIterator<E> {
    private final Object[] data;
    private int cursor;

    public MyArrayListListIterator(Object[] data, int index) {
        this.data = data;
        this.cursor = index - 1;
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
    public boolean hasPrevious() {
        return this.cursor >= 0;
    }

    @Override
    public E previous() {
        return (E) this.data[this.cursor--];
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
