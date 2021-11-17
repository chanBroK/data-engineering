package com.khc.kmooc.data_engineering.week12;


import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet);
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());

        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(1);

        System.out.println(treeSet);
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());
        System.out.println(treeSet.contains(3));
        System.out.println(treeSet.contains(4));

        treeSet.clear();

        System.out.println(treeSet);
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());

        TreeSet<Email> emailTreeSet = new TreeSet<>();
        emailTreeSet.add(new Email(3, 5));
        emailTreeSet.add(new Email(2, 4));
        emailTreeSet.add(new Email(1, 3));
        System.out.println(emailTreeSet);
    }
}
