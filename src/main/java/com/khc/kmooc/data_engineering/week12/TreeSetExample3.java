package com.khc.kmooc.data_engineering.week12;


import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);

        System.out.println(treeSet);
        System.out.println(treeSet.lower(5));
        System.out.println(treeSet.floor(6));
        System.out.println(treeSet.ceiling(4));
        System.out.println(treeSet.higher(5));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

    }
}
