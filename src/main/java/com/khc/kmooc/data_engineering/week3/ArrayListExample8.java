package com.khc.kmooc.data_engineering.week3;

import com.khc.kmooc.data_engineering.Email;

import java.util.ArrayList;

public class ArrayListExample8 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(5);
        intList.add(5);
        intList.add(7);

        System.out.println(intList);
        System.out.println(intList.indexOf(5));
        System.out.println(intList.lastIndexOf(5));
        ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email(0, 0));
        emails.add(new Email(0, 1));
        emails.add(new Email(0, 1));
        emails.add(new Email(2, 2));
        System.out.println(emails.indexOf(new Email(0, 1)));
        System.out.println(emails.lastIndexOf(new Email(0, 1)));

    }
}
