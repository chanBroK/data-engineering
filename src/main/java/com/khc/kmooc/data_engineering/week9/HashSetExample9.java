package com.khc.kmooc.data_engineering.week9;

import com.khc.kmooc.data_engineering.week4.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample9 {
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
        List<Email> emailList = getArrayListData();
//        HashSet<Occurrence> occSet = new HashSet<>();
        ArrayList<HashSet<Integer>> receivers = new ArrayList<>();

        for (int i = 0; i < 265214; i++) {
            receivers.add(new HashSet<Integer>());
        }
        for (Email email : emailList) {
            // 예제 8과 같은 이유로 hashset만으로는 해결이 불가능
            // receivers의 from index의 HashSet에 to를 추가
            HashSet<Integer> cur = receivers.get(email.from);
            cur.add(email.to);
            receivers.set(email.from, cur);

        }
        for (int i = 0; i < receivers.size(); i++) {
            System.out.println(i + " : " + receivers.get(i));
        }
    }
}
