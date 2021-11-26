package com.khc.kmooc.data_engineering.week13;

public class App2 {
    public static void main(String[] args){
        ComputeThreeIntegers cti = new ComputeThreeIntegers() {
            @Override
            public double compute(int x, int y, int z) {
                return x + y + z;
            }
        };
        System.out.println(cti.compute(3,4,5));

        // lambda 식이 함수형 인터페이스를 구현한다고 정의됨
        ComputeThreeIntegers cti2 = (int x,int y, int z)-> {
            return x+y+z;
        };
        System.out.println(cti2.compute(3,4,5));
    }
}
