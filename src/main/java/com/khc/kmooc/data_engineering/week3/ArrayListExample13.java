package com.khc.kmooc.data_engineering.week3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer val = iter.next();
            if (val % 2 == 0) {
//                list.remove(val);
                iter.remove();
            }
        }
        System.out.println(list);

    }
}
