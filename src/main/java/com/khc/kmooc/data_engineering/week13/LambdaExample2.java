package com.khc.kmooc.data_engineering.week13;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExample2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 짝수 제거
//        list.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if (integer % 2 == 0)
//                    return true;
//                return false;
//            }
//        });
        list.removeIf(t -> {
            if (t % 2 == 0)
                return true;
            return false;
        });
        System.out.println(list);
    }
}
