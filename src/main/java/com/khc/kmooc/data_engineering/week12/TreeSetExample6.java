package com.khc.kmooc.data_engineering.week12;


import java.util.TreeSet;

public class TreeSetExample6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(11);
        treeSet.add(13);

        for (Integer val : treeSet) {
            System.out.println(val);
        }

        for (Integer val : treeSet.descendingSet()) {
            System.out.println(val);
        }

        System.out.println(treeSet.subSet(3, true, 11, true));
        System.out.println(treeSet.subSet(3, false, 11, false));
    }
}
