package com.khc.kmooc.data_engineering.week5;

import com.khc.kmooc.data_engineering.week4.Email;

import java.util.*;

public class LinkedListExample2 {
    public static void main(String[] args) {
        Collection<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new LinkedList<>();
        Queue<Integer> list4 = new LinkedList<>();
        Deque<Integer> list5 = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        LinkedList<Integer> intList = new LinkedList<>(arrayList);
        LinkedList<String> strList = new LinkedList<>();
        LinkedList<Email> emailList = new LinkedList<>();

        System.out.println(arrayList);
        System.out.println(intList);
        System.out.println(strList);
        System.out.println(emailList);

    }
}
