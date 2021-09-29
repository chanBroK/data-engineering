package com.khc.kmooc.data_engineering.week1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Week1 {

    public static void main(String[] args) throws Exception {
        // ctrl + shift + f : auto formatting
        BufferedReader br = new BufferedReader(
                new FileReader("D:\\project\\eclipse_workspace\\data-engineering\\email.txt"));
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
            System.out.println(new Email(from, to));
        }
        br.close();
    }

}
