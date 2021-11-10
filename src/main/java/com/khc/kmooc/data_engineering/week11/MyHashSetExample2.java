package com.khc.kmooc.data_engineering.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MyHashSetExample2 {
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

    public static HashSet<Integer> getHashSetSenderIDs() throws IOException {
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
        }
        br.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        HashSet<Integer> idSet = getHashSetID();
        HashSet<Integer> senderSet = getHashSetSenderIDs();
        MyHashSet<Integer> senderSet2 = new MyHashSet<>(senderSet);
        ArrayList<Integer> senderArr = new ArrayList<>(senderSet);
        LinkedList<Integer> senderLinked = new LinkedList<>(senderSet);
        long time = System.currentTimeMillis();
        for (Integer id : idSet) {
            senderSet2.contains(id);
        }
        System.out.println("MyHashSet :" + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        for (Integer id : idSet) {
            senderSet.contains(id);
        }
        System.out.println("HashSet :" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer id : idSet) {
            senderArr.contains(id);
        }
        System.out.println("ArrayList :" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer id : idSet) {
            senderLinked.contains(id);
        }
        System.out.println("LinkedList :" + (System.currentTimeMillis() - time));

    }
}
