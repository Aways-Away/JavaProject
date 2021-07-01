package com.strings;

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        // 以一个减号或者没有减号开头
        System.out.println("5678".matches("-?\\d+"));
        // 以一个减号或者没有开头，但是不能以加号开头
        System.out.println("+911".matches("-?\\d+"));
        // 可以以一个加号或者减号开头，或者二者都没有
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}

