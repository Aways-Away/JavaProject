package com.c01_c04; /**
 * Created by LiuCui on 2021/5/23 19:57
 */

/**
 * 此时的结果又变回了false！这是由于equals()的默认行为是比较句柄
 */
class Value {
    int i;
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value n1 = new Value();
        Value n2 = new Value();
        n1.i = n2.i = 100;
        System.out.println(n1.equals(n2));
    }
}
