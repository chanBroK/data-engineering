package com.khc.kmooc.data_engineering.week5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);

        System.out.println(linkedList);
        List<Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println(linkedList.contains(5));
        System.out.println(arrayList.contains(5));

        System.out.println(linkedList.get(4));
        System.out.println(arrayList.get(4));

        System.out.println(linkedList.indexOf(5));
        System.out.println(arrayList.indexOf(5));
        System.out.println(linkedList.lastIndexOf(5));
        System.out.println(arrayList.lastIndexOf(5));
    }
}
