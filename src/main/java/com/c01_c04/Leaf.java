package com.c01_c04;

// 简单的使用this关键字
public class Leaf {
    int i = 0;
    Leaf increment(){
        i++;
        System.out.println("水");
        return this;  // 通过this 关键字返回当前对象的引用
    }
    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();

    }
}
