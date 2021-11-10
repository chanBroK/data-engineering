package com.khc.kmooc.data_engineering.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyHashSetExample5 {
    public static HashSet<Integer> getHashSetID() throws IOException {
        HashSet<Integer> data = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\personal\\data-engineering\\email.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("#")) {
                continue;
            }
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(from);
            data.add(to);
        }
        br.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        HashSet<Integer> hashset = getHashSetID();
        MyHashSet<Integer> myHashSet = new MyHashSet<>(hashset);
        ArrayList<Integer> arrayList = new ArrayList<>(myHashSet);

        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return -1;
                } else if (o1 > o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (Integer val : arrayList) {
            System.out.println(val);
        }


        TreeSet<Integer> treeSet = new TreeSet<>(hashset);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(0));
        Iterator<Integer> dIter = treeSet.descendingIterator();
        while (dIter.hasNext()) {
            System.out.println(dIter.next());
        }

    }
}
