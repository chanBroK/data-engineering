package com.khc.kmooc.data_engineering.week4;

import com.khc.kmooc.data_engineering.week1.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class ArrayListExample20 {

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

        data.sort(new Comparator<Email>() {
            // 오름차순
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.from < o2.from) {
                    return -1;
                } else if (o1.from == o2.from) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        Iterator<Email> iter = data.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
