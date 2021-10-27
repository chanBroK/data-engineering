package com.khc.kmooc.data_engineering.week9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set);
        for (int i = 0; i < 10000; i++) {
            set.add(i);
        }
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        set.clear();
        System.out.println(set);
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
        System.out.println(set);
        Integer[] arr = new Integer[10];
        arr = set.toArray(arr);
        for (Integer val : arr) {
            System.out.println(val);
        }
    }
}
