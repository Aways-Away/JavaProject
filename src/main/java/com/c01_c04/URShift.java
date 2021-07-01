package com.c01_c04;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        // “无符号”右移位运算符（>>>）
        // “无符号”右移位运算符（>>>），它使用了“零扩展”：无论正负，
        // 都在高位插入0。这一运算符是C 或C++没有的。
        i >>>= 10;
        System.out.println("i = " + i);
        long l = -1;
        l >>>= 10;
        System.out.println("l = " + l);
        short s = -1;
        s >>>= 10;
        System.out.println("s = " + s);
        byte b = -1;
        b >>>= 10;
        System.out.println("b = " + b);
    }
}
