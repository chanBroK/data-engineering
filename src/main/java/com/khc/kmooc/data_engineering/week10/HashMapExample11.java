package com.khc.kmooc.data_engineering.week10;

import com.khc.kmooc.data_engineering.week1.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HashMapExample11 {
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
        // from key, toSet value
        HashMap<Integer, HashSet<Integer>> receivers = new HashMap<>();
        for (Email email : data) {
            if (receivers.containsKey(email.from)) {
                receivers.get(email.from).add(email.to);
            } else {
                HashSet<Integer> newSet = new HashSet<>();
                newSet.add(email.to);
                receivers.put(email.from, newSet);
            }
        }
        System.out.println("receivers 생성 완료");

        HashMap<Integer, HashSet<Integer>> senders = new HashMap<>();
        for (Map.Entry<Integer, HashSet<Integer>> entry : receivers.entrySet()) {
            HashSet<Integer> toSet = entry.getValue();
            for (Integer to : toSet) {
                if (!senders.containsKey(to)) {
                    HashSet<Integer> newSet = new HashSet<>();
                    newSet.add(entry.getKey());
                    senders.put(to, newSet);
                } else {
                    senders.get(to).add(entry.getKey());
                }
            }
        }

        for (Map.Entry<Integer, HashSet<Integer>> entry : senders.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
