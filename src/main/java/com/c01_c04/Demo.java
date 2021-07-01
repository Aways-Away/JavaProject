package com.c01_c04;

/**
 * Created by LiuCui on 2021/5/23 0:13
 */
public class Demo {
    public int storage(String s) {
        return s.length() * 2;
    }

    boolean flag() {
        return true;
    }

    float naturalLogBase() {
        return (float) 2.718;
    }

    void nothing() {
        return;
    }

    void nothing2() {

    }

    public static void main(String[] args) {
        String s = "miao";
        Demo f = new Demo();

        int len = f.storage(s);
        System.out.println(len);

    }
}
