package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;

public class ArrayListExample6 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(0, 3);
        intList.add(1, 5);
        intList.add(2, 7);
        intList.add(1, 9);
        System.out.println(intList);
        System.out.println(intList.contains(5));
        System.out.println(intList.contains(6));


        ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email(0, 0));
        emails.add(new Email(0, 1));
        emails.add(new Email(2, 2));
        System.out.println(emails);
        System.out.println(emails.contains(new Email(0, 1)));
    }
}
