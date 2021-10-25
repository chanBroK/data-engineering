package com.khc.kmooc.data_engineering.week6;

import com.khc.kmooc.data_engineering.week4.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample11 {
    public static List<Email> getLinkedListData() throws IOException {
        List<Email> data = new LinkedList<>();
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
            data.add(0, new Email(from, to));
        }
        br.close();
        return data;
    }

    public static List<Email> getArrayListData() throws IOException {
        List<Email> data = new ArrayList<>();
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
            data.add(0, new Email(from, to));
        }
        br.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        long p1 = System.currentTimeMillis();
        List<Email> linked = getLinkedListData();
        long p2 = System.currentTimeMillis();
        System.out.println("LinkedList : " + (p2 - p1));
        p1 = System.currentTimeMillis();
        List<Email> array = getArrayListData();
        p2 = System.currentTimeMillis();
        System.out.println("LinkedList : " + (p2 - p1));
    }
}
