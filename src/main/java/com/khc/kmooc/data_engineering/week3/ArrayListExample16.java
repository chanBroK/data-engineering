package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;

public class ArrayListExample16 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Integer[] array = new Integer[5];
        array = list.toArray(array);
        for (Integer val : array) {
            System.out.println(val);
        }
    }
} 
