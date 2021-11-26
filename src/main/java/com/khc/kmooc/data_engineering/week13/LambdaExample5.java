package com.khc.kmooc.data_engineering.week13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class LambdaExample5 {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);

//        map.forEach(new BiConsumer<Integer, Integer>() {
//            @Override
//            public void accept(Integer integer, Integer integer2) {
//                // integer -> key
//                // integer2 -> value
//                System.out.println(integer + ":" + integer2);
//            }
//        });
        map.forEach((key,value)->{
            System.out.println(key + " : " + value);
        });
    }
}
