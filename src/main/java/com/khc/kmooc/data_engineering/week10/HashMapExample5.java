package com.khc.kmooc.data_engineering.week10;

import java.util.HashMap;

public class HashMapExample5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(1);
        for (int i = 0; i < 1000; i++) {
            map.put(i, i);
        }
        System.out.println(map);
    }
}
