package com.khc.kmooc.data_engineering.week3;

import com.khc.kmooc.data_engineering.Email;

import java.util.ArrayList;

public class ArrayListExample10 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(5);
        intList.add(7);
        intList.add(9);

        System.out.println(intList);
//        System.out.println(intList.remove(5));
//         -> 5가 index로 인식되서 생기는 문제
        System.out.println(intList.remove(Integer.valueOf(5)));
        System.out.println(intList.remove(Integer.valueOf(11)));
        System.out.println(intList);

        ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email(0, 1));
        emails.add(new Email(1, 2));
        emails.add(new Email(2, 4));

        System.out.println(emails);
        System.out.println(emails.remove(new Email(0, 1)));
        System.out.println(emails.remove(new Email(3, 6)));
        System.out.println(emails);

    }
}
