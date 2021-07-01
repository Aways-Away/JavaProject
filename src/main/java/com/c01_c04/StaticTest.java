package com.c01_c04;

/**
 * Created by LiuCui on 2021/5/23 16:03
 */
public class StaticTest {
    static int i = 47;

    static void incr(){
        StaticTest.i++;
        System.out.println("i = " + i);
    }


    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st2.i = " + st2.i);
        System.out.println("st1.i = " + st1.i);
        incr();
    }
}

