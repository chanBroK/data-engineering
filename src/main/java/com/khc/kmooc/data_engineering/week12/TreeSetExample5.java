package com.khc.kmooc.data_engineering.week12;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample5 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);

        System.out.println(treeSet);
        Iterator<Integer> iter = treeSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        iter = treeSet.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        TreeSet<Email> emailSet = new TreeSet<>(new Comparator<Email>() {
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.to > o2.to)
                    return -1;
                else if (o1.to == o2.to)
                    return 0;
                else
                    return 1;
            }
        });
        emailSet.add(new Email(3, 1));
        emailSet.add(new Email(2, 1));
        emailSet.add(new Email(1, 3));
        System.out.println(emailSet);
    }
}
