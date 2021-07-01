package com.c01_c04;

// 可以用this调用构建器，但是不可以调用两个
// Calling constructors with "this"
public class Flower {
    int petalCount = 0;
    String s = new String("null");
    Flower(int petals){
        petalCount = petals;
        System.out.println("petalCount = " + petalCount);
    }
    Flower(String ss){
        System.out.println("ss = " + ss);
        s = ss;
    }
    // 构建器
    Flower(String s, int petals){
        this(petals);
        // this(s); // Can;t call two
        this.s = s;
        System.out.println("String & int args");
    }
    Flower(){
        this("hi", 47);
        System.out.println("deafault constructors (no args)");
    }
    void print(){
        // this(11); // Not inside non-constructor
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x =new Flower();
        x.print();
    }



}
