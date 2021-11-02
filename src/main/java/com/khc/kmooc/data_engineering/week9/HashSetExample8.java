package com.khc.kmooc.data_engineering.week9;

import com.khc.kmooc.data_engineering.week1.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HashSetExample8 {
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
        ArrayList<Integer> occurrence = new ArrayList<>();

        for (int i = 0; i < 265215; i++) {
            occurrence.add(0);
        }
        for (Email email : emailList) {
            // occSet에 from이 있다면, 가져와서 count를 1 늘려준다.
            // occset에 to가 있다면, 가져와서 count를 1 늘려준다.
            // HashSet으로 불가능 : 실패
            // ArrayList이용
            occurrence.set(email.from, occurrence.get(email.from) + 1);
            occurrence.set(email.to, occurrence.get(email.to) + 1);
        }
        for (int i = 0; i < occurrence.size(); i++) {
            if (occurrence.get(i) != 0) {
                System.out.println(i + " : " + occurrence.get(i));
            }
        }
    }
}
