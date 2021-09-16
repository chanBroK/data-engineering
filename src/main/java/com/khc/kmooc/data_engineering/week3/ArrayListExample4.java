package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println(intList.isEmpty());
        System.out.println(intList.size());

        intList.add(3);

        System.out.println(intList.isEmpty());
        System.out.println(intList.size());

        intList.add(7);
        intList.add(5);
        System.out.println(intList.isEmpty());
        System.out.println(intList.size());

    }
}
