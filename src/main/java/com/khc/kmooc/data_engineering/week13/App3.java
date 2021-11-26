package com.khc.kmooc.data_engineering.week13;

public class App3 {
    public static void main(String[] args){
        // lambda 식이 함수형 인터페이스를 구현한다고 정의됨
        ComputeThreeIntegers cti2 = (int x,int y, int z)-> {
            return x+y+z;
        };
        // 어차피 하나의 함수를 구현하기 때문에 매개변수의 타입을 정의하지 않아도 추론이 가능하다
        cti2 = (x, y, z) -> {
            return x + y + z;
        };
        cti2 = (x,y,z)->x+y+z;

        System.out.println(cti2.compute(3,4,5));

        // 매개변수의 이름을 바꾸어도 추론가능하다.
        ConsumeThreeIntegers cti3 = (a, b, c) -> {
            System.out.println(a + b + c);
        };
        cti3 = (a,b,c)-> System.out.println(a+b+c);
        cti3.consume(3, 4, 5);
        
        // 매개변수가 하나면 소괄호도 생략가능
        ComputeRadius cr = r ->3.14 * r * r;
        System.out.println(cr.compute(3));

    }
}
