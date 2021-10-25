package com.khc.kmooc.data_engineering.week6;

import java.util.*;

public class MyLinkedList<E> implements List<E>, Queue<E> {
    private int size;
    private MyNode<E> first;
    private MyNode<E> last;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public MyLinkedList(Collection<E> c) {
        // 기존 생성자 실행
        this();
        for (E item : c) {
            this.add(item);
        }
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        } else {
            String result = "[";
            result += this.first.getItem();
            MyNode<E> cursor = this.first.getNext();
            while (cursor != null) {
                result += ", " + cursor.getItem();
                cursor = cursor.getNext();
            }
            result += "]";
            return result;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (first == null) {
            // empty
            MyNode<E> newNode = new MyNode<E>(null, e, null);
            first = newNode;
            last = newNode;
            size++;
        } else {
            // not empty
            MyNode<E> newNode = new MyNode<>(last, e, null);
            last.setNext(newNode);
            last = newNode;
            size++;

        }
        return true;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
