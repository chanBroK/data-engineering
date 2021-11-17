package com.khc.kmooc.data_engineering.week12;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample8 {
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
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                    return -1;
                else if (o1.equals(o2))
                    return 0;
                else
                    return 1;
            }
        });
//        System.out.println(arrayList);
        System.out.println(System.currentTimeMillis() - end);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        end = System.currentTimeMillis();
//        System.out.println(treeSet);
        System.out.println(System.currentTimeMillis() - end);
    }
}
