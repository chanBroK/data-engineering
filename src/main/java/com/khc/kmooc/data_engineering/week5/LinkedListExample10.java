package com.khc.kmooc.data_engineering.week5;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListExample10 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        try {
            System.out.println(linkedList.remove());

        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("비어 있어서 Exception 발생");
        }
        System.out.println(linkedList.poll());
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.offer(7);
        linkedList.offer(9);
        System.out.println(linkedList.remove());
        System.out.println(linkedList.poll());
    }
}
