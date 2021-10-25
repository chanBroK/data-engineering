package com.khc.kmooc.data_engineering.week7;

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
        if (size == 0) {
            return false;
        }
        MyNode<E> cursor = this.first;
        do {
            if (cursor.getItem().equals(o))
                return true;
            cursor = cursor.getNext();
        } while (cursor != null);
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListListIterator<>(this, 0);
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[this.size];
        int idx = 0;
        for (E val : this) {
            arr[idx++] = val;
        }
        return arr;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (this.first == null) {
            // empty
            MyNode<E> newNode = new MyNode<E>(null, e, null);
            this.first = newNode;
            this.last = newNode;
            this.size++;
        } else {
            // not empty
            MyNode<E> newNode = new MyNode<>(this.last, e, null);
            this.last.setNext(newNode);
            this.last = newNode;
            this.size++;

        }
        return true;
    }

    @Override
    public boolean offer(E e) {
        if (this.first == null) {
            // empty
            MyNode<E> newNode = new MyNode<E>(null, e, null);
            this.first = newNode;
            this.last = newNode;
            this.size++;
        } else {
            // not empty
            MyNode<E> newNode = new MyNode<>(this.last, e, null);
            this.last.setNext(newNode);
            this.last = newNode;
            this.size++;

        }
        return true;
    }

    @Override
    public E remove() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        } else {
            return remove(0);
        }
    }

    @Override
    public E poll() {
        if (this.size == 0) {
            return null;
        } else {
            return remove(0);
        }
    }

    @Override
    public E element() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        } else {
            return get(0);
        }
    }

    @Override
    public E peek() {
        if (this.size == 0) {
            return null;
        } else {
            return get(0);
        }
    }


    private MyNode<E> getNode(Object o) {
        MyNode<E> cursor = first;
        do {
            if (cursor.getItem().equals(o))
                return cursor;
            cursor = cursor.getNext();
        } while (cursor != null);
        return null;
    }

    @Override
    public boolean remove(Object o) {
        MyNode<E> nodeToRemove = this.getNode(o);
        if (nodeToRemove == null)
            return false;

        MyNode<E> next = nodeToRemove.getNext();
        E element = nodeToRemove.getItem();
        MyNode<E> prev = nodeToRemove.getPrev();

        if (prev == null) {
            //nodeToRemove가 first일때
            this.first = next;
        } else {
            prev.setNext(next);
        }

        if (next == null) {
            //nodeToRemove가 last일때
            last = prev;
        } else {
            next.setPrev(prev);
        }

        this.size--;
        return true;
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
        while (this.size != 0) {
            remove(0);
        }
    }

    @Override
    public E get(int index) {
        if (index >= this.size || index < 0)
            throw new IndexOutOfBoundsException("Index" + index + "out of bounds for length" + this.size);

        int cIdx = 0;
        MyNode<E> cursor = this.first;
        do {
            if (cIdx == index)
                return cursor.getItem();
            cursor = cursor.getNext();
            cIdx++;
        } while (cursor != null);

        return null;
    }

    @Override
    public E set(int index, E element) {
        MyNode<E> node = this.getNode(index);
        E prevValue = node.getItem();
        node.setItem(element);
        return prevValue;
    }

    public MyNode<E> getNode(int index) {
        if (index >= this.size || index < 0)
            throw new IndexOutOfBoundsException("Index" + index + "out of bounds for length" + this.size);

        int cIdx = 0;
        MyNode<E> cursor = this.first;
        do {
            if (cIdx == index)
                return cursor;
            cursor = cursor.getNext();
            cIdx++;
        } while (cursor != null);

        return null;
    }

    @Override
    public void add(int index, E element) {
        if (index > this.size || index < 0)
            throw new IndexOutOfBoundsException("Index" + index + "out of bounds for length" + this.size);
        if (this.size == index) {
            // 가장 마지막 추가
            this.add(element);
        } else {
            // 마지막 이외에 추가
            MyNode<E> next = getNode(index);
            MyNode<E> prev = next.getPrev();
            // 새로운 노드 추가
            MyNode<E> newNode = new MyNode<>(prev, element, next);
            // prev에 대한 참고 재조정
            if (prev != null) {
                // 처음 위치에 추가하는 것이 아님
                prev.setNext(newNode);
            } else {
                this.first = newNode;
            }
            next.setPrev(newNode);
            size++;
        }
    }

    @Override
    public E remove(int index) {
        MyNode<E> nodeToRemove = this.getNode(index);
        MyNode<E> next = nodeToRemove.getNext();
        E element = nodeToRemove.getItem();
        MyNode<E> prev = nodeToRemove.getPrev();

        if (prev == null) {
            //nodeToRemove가 first일때
            this.first = next;
        } else {
            prev.setNext(next);
        }

        if (next == null) {
            //nodeToRemove가 last일때
            last = prev;
        } else {
            next.setPrev(prev);
        }

        this.size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        if (this.size == 0)
            return -1;
        int cIdx = 0;
        MyNode<E> cursor = this.first;
        do {
            if (cursor.getItem().equals(o))
                return cIdx;
            cursor = cursor.getNext();
            cIdx++;
        } while (cursor != null);
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // 강의에서 해당 size == 0 조건 없어도 된다고 하는데, 없으면 NullPointerException 발생
        if (this.size == 0)
            return -1;
        int cIdx = this.size - 1;
        MyNode<E> cursor = this.last;
        do {
            if (cursor.getItem().equals(o))
                return cIdx;
            cursor = cursor.getPrev();
            cIdx--;
        } while (cursor != null);
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new MyLinkedListListIterator<>(this, 0);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new MyLinkedListListIterator<>(this, index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
