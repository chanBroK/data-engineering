package com.khc.kmooc.data_engineering.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MyHashSetExample4 {
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
        ArrayList<Integer> arrayList = new ArrayList<>(hashset);
        LinkedList<Integer> linkedList = new LinkedList<>(hashset);

        int min = Integer.MAX_VALUE;
        long time = System.currentTimeMillis();
        for (Integer val : hashset) {
            if (val < min)
                min = val;
        }
        System.out.println("hashset :" + (System.currentTimeMillis() - time));

        min = Integer.MAX_VALUE;
        time = System.currentTimeMillis();
        for (Integer val : myHashSet) {
            if (val < min)
                min = val;
        }
        System.out.println("myHashSet :" + (System.currentTimeMillis() - time));

        min = Integer.MAX_VALUE;
        time = System.currentTimeMillis();
        for (Integer val : arrayList) {
            if (val < min)
                min = val;
        }
        System.out.println("arrayList :" + (System.currentTimeMillis() - time));

        min = Integer.MAX_VALUE;
        time = System.currentTimeMillis();
        for (Integer val : linkedList) {
            if (val < min)
                min = val;
        }
        System.out.println("linkedList :" + (System.currentTimeMillis() - time));

    }
}
