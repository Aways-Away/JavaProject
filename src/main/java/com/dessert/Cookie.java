package com.dessert;

public class Cookie {
    public Cookie() {
        System.out.println("Cookie constructor");
    }

    void bite() {
        System.out.println("bite()");
    }

    public static void main(String[] args) {
        new Cookie().bite();
    }
}
