package com.khc.kmooc.data_engineering.week9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<Integer> intHashSet = new HashSet<>();
        System.out.println(intHashSet);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);
        System.out.println(arrayList);

        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);
    }
}
