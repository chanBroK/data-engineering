package com.khc.kmooc.data_engineering.week3;

import com.khc.kmooc.data_engineering.Email;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println(intList.isEmpty());
        System.out.println(intList.size());
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println(stringList.isEmpty());
        System.out.println(stringList.size());
        ArrayList<Email> emailList = new ArrayList<>();
        System.out.println(emailList.isEmpty());
        System.out.println(emailList.size());
    }
}
