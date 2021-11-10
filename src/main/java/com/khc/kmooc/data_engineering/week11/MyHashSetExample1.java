package com.khc.kmooc.data_engineering.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MyHashSetExample1 {
    public static LinkedList<Integer> getLinkeListID() throws IOException {
        LinkedList<Integer> data = new LinkedList<>();
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

            if (!data.contains(from)) {
                data.add(from);
            }
            if (!data.contains(to)) {
                data.add(to);
            }
        }
        br.close();
        return data;
    }

    public static ArrayList<Integer> getArrayListID() throws IOException {
        ArrayList<Integer> data = new ArrayList<>();
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

            if (!data.contains(from)) {
                data.add(from);
            }
            if (!data.contains(to)) {
                data.add(to);
            }
        }
        br.close();
        return data;
    }

    public static MyHashSet<Integer> getMyHashSetID() throws IOException {
        MyHashSet<Integer> data = new MyHashSet<>();
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
        long time = System.currentTimeMillis();
        MyHashSet<Integer> myHashSet = getMyHashSetID();
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        ArrayList<Integer> arr = getArrayListID();
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        LinkedList<Integer> linked = getLinkeListID();
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        HashSet<Integer> hashSet = getHashSetID();
        System.out.println(System.currentTimeMillis() - time);
    }
}
