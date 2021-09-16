package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;

public class ArrayListExample7 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(0, 3);
        intList.add(1, 5);
        intList.add(2, 7);
        intList.add(1, 9);
        System.out.println(intList);
        System.out.println(intList.get(0));
        System.out.println(intList.get(1));
        System.out.println(intList.get(2));
        System.out.println(intList.get(3));
    }
}
