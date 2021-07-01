package com.c01_c04;

import java.util.Date;

/**
 * Created by LiuCui on 2021/5/23 16:12
 */
public class HelloDate {
    public static void main(String[] args) {
        /** Sole entry point to class & application
         * @param args array of string arguments
         * @return No return value
         * @exception exceptions No exceptions thrown
         */
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
        // 用于暂停输出，只是让程序暂停的一个技巧
        try {
            Thread.currentThread().sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
