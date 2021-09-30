package com.khc.kmooc.data_engineering.week5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        System.out.println(intList.isEmpty());
        System.out.println(intList.size());

        intList.add(3);
        intList.add(4);
        intList.add(7);

        List<Integer> arrayList = new ArrayList<>(intList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());

        intList.add(1, 9);
        arrayList.add(1, 9);
        
        System.out.println(intList);
        System.out.println(arrayList);

    }
}
