package com.khc.kmooc.data_engineering.week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ArrayListExample19 {

    public static ArrayList<Email> getData() throws IOException {
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
        ArrayList<Email> data = getData();
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Email email : data) {
            int from = email.from;
            int to = email.to;
            count++;
            if (from > max) {
                max = from;
            }
            if (from < min) {
                min = from;
            }
            if (to > max) {
                max = to;
            }
            if (to < min) {
                min = to;
            }
        }
        System.out.println("event count = " + count);
        System.out.println("max ID = " + max);
        System.out.println("min ID = " + min);
    }
}
