package com.c01_c04;

/**
 * Created by LiuCui on 2021/5/23 16:41
 */


class Number {
    int i;
}

public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("n1.i = " + n1.i);
        System.out.println("n2.i = " + n2.i);
        System.out.println();
        n1 = n2;
        System.out.println("n1.i = " + n1.i);
        System.out.println("n2.i = " + n2.i);
        System.out.println();
        n1.i = 27;
        System.out.println("n1.i = " + n1.i);
        System.out.println("n2.i = " + n2.i);
    }
}
