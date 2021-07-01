package com.c01_c04;

public class Ternary {
    static int ternary(int i){
        return i < 10 ? i * 100 : i * 10;
    }

    public static void main(String[] args) {
        int res = ternary(11);
        System.out.println("res = " + res);
        int x = 0, y = 1, z = 2;
        String sString = "x, y, z ";
        System.out.println(sString + x + y + z);
        System.out.println(x + sString);
    }
}
