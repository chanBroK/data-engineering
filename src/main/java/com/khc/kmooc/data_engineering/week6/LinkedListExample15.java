package com.khc.kmooc.data_engineering.week6;

import java.util.ArrayList;

public class LinkedListExample15 {
    public static void main(String[] args) {


        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(5);

        MyLinkedList<Integer> myList = new MyLinkedList<>(array);
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
