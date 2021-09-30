package com.khc.kmooc.data_engineering.week5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample6 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        Iterator<Integer> iter = linkedList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (Integer val : linkedList) {
            System.out.println(val);
        }
        ListIterator<Integer> listIter = linkedList.listIterator(4);
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }
    }
}
