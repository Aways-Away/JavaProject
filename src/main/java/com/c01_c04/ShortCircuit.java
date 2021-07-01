package com.c01_c04;

/**
 * 短路
 * 只有明确整个表达式真或假的结论，才会对表达式进行逻辑求值。
 * 因此，一个逻辑表达式的所有部分都有可能不进行求值
 */
public class ShortCircuit {
    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        if (test1(0) && test2(2) && test3(3)){ // 第2个逻辑表达式为false，因此不对第3个表达式进行执行。
            System.out.println("expression is true");
        }else {
            System.out.println("expression is false");
        }
    }
}
