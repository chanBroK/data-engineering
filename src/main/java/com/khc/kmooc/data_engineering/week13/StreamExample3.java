package com.khc.kmooc.data_engineering.week13;

import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args){
        Stream<Integer> s = Stream.of(1,2,3,4,5);
        // 디버깅시 map은 바로 호출되지 않고 forEach차례가 된 후 map이 수행되고 foreach가 수행된다
        s.map( e -> {
            if(e % 2 == 0)
                return true;
            else
                return false;
        }).forEach( e-> System.out.println(e));
    }
}
