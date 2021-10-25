package com.khc.kmooc.data_engineering.week6;

import com.khc.kmooc.data_engineering.week4.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample12 {
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
            data.add(new Email(from, to));
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
            data.add(new Email(from, to));
        }
        br.close();
        return data;
    }

    public static void main(String[] args) throws IOException {

        List<Email> array = getArrayListData();
        List<Email> linked = getLinkedListData();

        long currentTime = System.currentTimeMillis();
        int from = 0;
        for (Email email : array) {
            from += email.from;
        }
        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        from = 0;
        for (Email email : linked) {
            from += email.from;
        }
        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        from = 0;
        for (int i = 0; i < array.size(); i++) {
            from += array.get(i).from;
        }
        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        from = 0;
        for (int i = 0; i < linked.size(); i++) {
            from += linked.get(i).from;
        }
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}
