package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer val = iter.next();
            System.out.println(val);
        }
        Iterator<Integer> listIter = list.listIterator(0);
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }

        ListIterator<Integer> listIter2 = list.listIterator(list.size());
        while (listIter2.hasPrevious()) {
            System.out.println(listIter2.previous());
        }
    }
} 
