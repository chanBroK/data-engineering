package com.khc.kmooc.data_engineering.week10;

import com.khc.kmooc.data_engineering.week1.Email;

import java.util.HashMap;

public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(2, 5);
        System.out.println(map);

        HashMap<Email, Integer> map2 = new HashMap<Email, Integer>();
        map2.put(new Email(1, 2), 3);
        map2.put(new Email(1, 2), 5);
        System.out.println(map2);
        map2.put(new Email(1, 2), 7);
        System.out.println(map2);

        // solution 1 - same address(same variable)
        HashMap<Email, Integer> map3 = new HashMap<Email, Integer>();
        Email e1 = new Email(1, 2);
        map3.put(e1, 3);
        map3.put(e1, 5);
        System.out.println(map3);
        map3.put(e1, 7);
        System.out.println(map3);
        // solution 2 - implement hashcode, equals method in custom class
    }
}
