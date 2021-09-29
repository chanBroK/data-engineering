package com.khc.kmooc.data_engineering.week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;


public class ArrayListExample21 {

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
                // 양수, 음수면 됨 .
                // 양수 -> 교환이 일어남
                // 음수,0 -> 교환이 일어나지 않음
                if (o1.to < o2.to) {
                    return 222222;
                } else if (o1.to == o2.to) {
                    return 0;
                } else {
                    return -222222;
                }
            }
        });

        ListIterator<Email> iter = data.listIterator(data.size());
        // 앞으로 순회 : 인자 = -1 (default)
        // 뒤로 순회 : 인자 = size()
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());

        }
    }
}
