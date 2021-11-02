package com.khc.kmooc.data_engineering.week10;

import com.khc.kmooc.data_engineering.week1.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample9 {
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
        List<Email> data = getArrayListData();
        HashMap<Integer, Integer> occurrence = new HashMap<>();
        for (Email email : data) {
            if (occurrence.containsKey(email.from)) {
                occurrence.put(email.from, occurrence.get(email.from) + 1);
            } else {
                occurrence.put(email.from, 1);
            }
            if (occurrence.containsKey(email.to)) {
                occurrence.put(email.to, occurrence.get(email.to) + 1);
            } else {
                occurrence.put(email.to, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : occurrence.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
