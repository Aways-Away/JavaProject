package com.c01_c04;

/**
 * Created by LiuCui on 2021/5/23 19:44
 */
class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'l';
        System.out.println("1: x.c = " + x.c);
        f(x);
        System.out.println("2: x.c = " + x.c);

    }

}
