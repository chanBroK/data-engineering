package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;

public class ArrayListExample5 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(0, 3);
        intList.add(1, 5);
        intList.add(2, 7);
        intList.add(1, 9);
        System.out.println(intList.toString());
    }
}
