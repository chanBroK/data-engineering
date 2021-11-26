package com.khc.kmooc.data_engineering.week13;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args){
        Stream<Integer> s = Stream.of(1,2,3,4,5);
        s.forEach(e ->System.out.println(e));
        s = Stream.of(1,2,3,4,5);
        s.map( e -> {
            if(e % 2 == 0)
                return true;
            else
                return false;
        });
    }
}
