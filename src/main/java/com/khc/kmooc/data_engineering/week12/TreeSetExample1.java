package com.khc.kmooc.data_engineering.week12;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(1);
        treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
