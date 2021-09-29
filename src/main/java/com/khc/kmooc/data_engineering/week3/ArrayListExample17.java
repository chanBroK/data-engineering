package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample17 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println(list);
        // list.sort() 의 인자로 인터페이스가 필요하다.
        // 인터페이스를 구현한 클래스의 인스턴스를 이용하면 된다.
        list.sort(new MyIntegerComparator());

        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1.equals(o2)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        System.out.println(list);


        ArrayList<Email> emails = new ArrayList<Email>();
        emails.add(new Email(5, 1));
        emails.add(new Email(3, 4));
        emails.add(new Email(2, 2));
        emails.add(new Email(4, 3));
        emails.add(new Email(1, 5));
        System.out.println(emails);

        emails.sort(new Comparator<Email>() {
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.from > o2.from) {
                    return -1;
                } else if (o1.from == o2.from) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        System.out.println(emails);

        emails.sort(new Comparator<Email>() {
            @Override
            public int compare(Email o1, Email o2) {
                if (o1.to > o2.to) {
                    return 1;
                } else if (o1.to == o2.to) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        System.out.println(emails);


    }
} 
