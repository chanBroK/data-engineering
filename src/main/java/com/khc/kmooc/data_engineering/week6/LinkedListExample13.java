package com.khc.kmooc.data_engineering.week6;


import com.khc.kmooc.data_engineering.week1.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample13 {
    public static LinkedList<Email> getLinkedListData() throws IOException {
        LinkedList<Email> data = new LinkedList<>();
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
            data.add(new Email(from, to));
        }
        br.close();
        return data;
    }

    public static ArrayList<Email> getArrayListData() throws IOException {
        ArrayList<Email> data = new ArrayList<>();
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
            data.add(new Email(from, to));
        }
        br.close();
        return data;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Email> array = getArrayListData();
        LinkedList<Email> linked = getLinkedListData();

        long currentTime = System.currentTimeMillis();
        while (true) {
            Email email = linked.poll();
            if (email == null) {
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - currentTime);


        currentTime = System.currentTimeMillis();
        while (true) {
            if (array.size() > 0) {
                array.remove(0);
            } else {
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}
