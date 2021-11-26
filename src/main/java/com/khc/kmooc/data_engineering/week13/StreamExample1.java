package com.khc.kmooc.data_engineering.week13;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args){
        // instance 를 통해 만들기
        Stream<Integer> s1 = Stream.of(1,2,3,4);
        // array 를 통해 만들기
        String[] str= new String[3];
        str[0] = "a";
        str[1] = "b";
        str[2] = "c";
        Stream<String> s2 = Arrays.stream(str);
        // Collection 을 통해 만들기
        List<Integer> list = List.of(1,2,3,4);
        new ArrayList<Integer>(list).stream();
        new LinkedList<Integer>(list).stream();
        new HashSet<Integer>(list).stream();
        new TreeSet<Integer>(list).stream();

        Map<String,String> map = Map.of("jack","DataEngineering");
        new HashMap<>(map).entrySet().stream();
        new HashMap<>(map).keySet().stream();
        new HashMap<>(map).values().stream();
    }
}
