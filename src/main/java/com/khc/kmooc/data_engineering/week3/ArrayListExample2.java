package com.khc.kmooc.data_engineering.week3;

import com.khc.kmooc.data_engineering.Email;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.println(intList.isEmpty());
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println(stringList.isEmpty());
        ArrayList<Email> emailList = new ArrayList<>();
        System.out.println(emailList.isEmpty());
    }
}
