package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;

public class ArrayListExample9 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(5);
        intList.add(7);
        intList.add(9);

        System.out.println(intList);
        intList.add(1, 4);
        System.out.println(intList);
        intList.set(2, 11);
        System.out.println(intList);

    }
}
