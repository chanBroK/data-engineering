package com.khc.kmooc.data_engineering.week12;


import java.util.TreeSet;

public class TreeSetExample4 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);

        System.out.println(treeSet);
        System.out.println(treeSet.remove(3));
        System.out.println(treeSet);
        System.out.println(treeSet.remove(2));
        System.out.println(treeSet);

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);
    }
}
