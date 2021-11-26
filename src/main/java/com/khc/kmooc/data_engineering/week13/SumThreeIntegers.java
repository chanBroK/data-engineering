package com.khc.kmooc.data_engineering.week13;

public class SumThreeIntegers implements ComputeThreeIntegers{

    @Override
    public double compute(int x, int y, int z) {
        return x+y+z;
    }
}
