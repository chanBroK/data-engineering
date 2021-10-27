package com.khc.kmooc.data_engineering.week9;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.add(1);
        System.out.println(set);
        set.add(1);
        System.out.println(set);
        set.add(3);
        System.out.println(set);
        set.add(5);
        System.out.println(set);

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(3));
        System.out.println(set.contains(4));

        set.remove(3);
        System.out.println(set);
        System.out.println(set.size());
    }
}
