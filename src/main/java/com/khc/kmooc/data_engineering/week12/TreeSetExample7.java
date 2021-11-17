package com.khc.kmooc.data_engineering.week12;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample7 {
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
        HashSet<Integer> hashSet = getHashSetID();
        long end = System.currentTimeMillis();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            for (Integer val : hashSet) {
                if (val < min)
                    min = val;
            }
        }
        System.out.println(System.currentTimeMillis() - end);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        end = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            min = treeSet.first();
        }
        System.out.println(System.currentTimeMillis() - end);
    }
}
