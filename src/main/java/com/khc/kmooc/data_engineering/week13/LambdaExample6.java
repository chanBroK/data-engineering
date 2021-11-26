package com.khc.kmooc.data_engineering.week13;

import java.util.HashMap;
import java.util.function.BiFunction;

public class LambdaExample6 {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
//        map.compute(3, new BiFunction<Integer, Integer, Integer>() {
//            @Override
//            public Integer apply(Integer k, Integer v) {
//                System.out.println(k +"->" +v);
//                return 7;
//            }
//        });
        map.compute(3,(key,value)->7);
        System.out.println(map);
    }
}
