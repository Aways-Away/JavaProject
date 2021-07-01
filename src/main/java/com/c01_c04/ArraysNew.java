package com.c01_c04;

import java.util.Random;

public class ArraysNew {
    static Random rand = new Random();
    static int pRand(int mod){
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[pRand(20)];  // 数组的大小是随机的
        System.out.println("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
