package com.khc.kmooc.data_engineering.week13;

public class App1 {
    public static void main(String[] args){
        double sum = new SumThreeIntegers().compute(3,4,5);

        System.out.println(sum);

        sum = new ComputeThreeIntegers() {
            @Override
            public double compute(int x, int y, int z) {
                return x + y + z;
            }
        }.compute(3,4,5);
        System.out.println(sum);
    }
}
