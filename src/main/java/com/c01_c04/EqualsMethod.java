package com.c01_c04; /**
 * Created by LiuCui on 2021/5/23 19:54
 */

/**
 * 若想对比两个对象的实际内容是否相同，又该如何操作呢？
 * 此时，必须使用所有对象都适用的特殊方法equals()
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.equals(n2));
    }
}
