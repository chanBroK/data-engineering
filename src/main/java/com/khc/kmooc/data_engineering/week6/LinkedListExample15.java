package com.khc.kmooc.data_engineering.week6;

public class LinkedListExample15 {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
