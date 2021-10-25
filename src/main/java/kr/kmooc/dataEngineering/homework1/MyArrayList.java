package kr.kmooc.dataEngineering.homework1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
    private Object[] data;

    public MyArrayList() {
        this.data = new Object[0];
    }

    public String toString() {
        String result = "[";
        for (Object val : this.data) {
            result += " " + val + " ";
        }
        result += "]";
        return result;
    }

    @Override
    public int size() {
        return this.data.length;
    }

    @Override
    public boolean isEmpty() {
        return this.data == null || this.data.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object val : this.data) {
            if (val.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator<>(this.data);
    }

    @Override
    public Object[] toArray() {
        return this.data;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < data.length) {
            a = (T[]) Array.newInstance(a.getClass().componentType(), data.length);
        }
        for (int i = 0; i < data.length; i++) {
            a[i] = (T) data[i];
        }
        return a;
    }

    @Override
    public boolean add(E e) {
        Object[] newData = new Object[this.data.length + 1];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        newData[newData.length - 1] = e;
        this.data = newData;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = this.indexOf(o);
        if (index == -1) {
            return false;
        } else {
            Object[] newData = new Object[this.data.length - 1];
            for (int i = 0; i < index; i++) {
                newData[i] = this.data[i];
            }
            for (int i = index + 1; i < this.data.length; i++) {
                newData[i - 1] = this.data[i];
            }
            this.data = newData;
            return true;
        }
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
        this.data = new Object[0];
    }

    @Override
    public E get(int index) {
        if (index >= this.data.length || index < 0) {
            throw new IndexOutOfBoundsException("Index" + index + "out of bounds for length" + this.data.length);
        }
        return (E) this.data[index];
    }

    @Override
    public E set(int index, E element) {
        if (index >= this.data.length || index < 0) {
            throw new IndexOutOfBoundsException("Index" + index + "out of bounds for length" + this.data.length);
        }
        E previous = (E) this.data[index];
        this.data[index] = element;
        return previous;
    }

    @Override
    public void add(int index, E element) {
        if (index > this.data.length || index < 0) {
            throw new IndexOutOfBoundsException("Index" + index + "out of bounds for length" + this.data.length);
        }
        Object[] newData = new Object[this.data.length + 1];
        for (int i = 0; i < index; i++) {
            newData[i] = this.data[i];
        }
        newData[index] = element;
        for (int i = index; i < this.data.length; i++) {
            newData[i + 1] = this.data[i];
        }
        this.data = newData;
    }

    @Override
    public E remove(int index) {
        if (index >= this.data.length || index < 0) {
            throw new IndexOutOfBoundsException("Index" + index + "out of bounds for length" + this.data.length);
        }
        E previous = (E) this.data[index];
        Object[] newData = new Object[this.data.length - 1];
        for (int i = 0; i < index; i++) {
            newData[i] = this.data[i];
        }
        for (int i = index + 1; i < this.data.length; i++) {
            newData[i - 1] = this.data[i];
        }
        this.data = newData;
        return previous;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = this.data.length - 1; i >= 0; i--) {
            if (this.data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new com.khc.kmooc.data_engineering.week4.MyArrayListListIterator<E>(data, 0);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return new MyArrayListListIterator<E>(data, index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
