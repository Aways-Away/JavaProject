package com.c01_c04;

import java.util.Random;

public class ArrayClassObj {

    static Random rand = new Random();
    static int pRand(int mod){
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[pRand(20)];
        System.out.println("a.length = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = pRand(500);
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
