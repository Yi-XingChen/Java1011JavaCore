package com.yxc.javacore.day05.lesson;

/**
 * Copyright(c)2018 YCKJ. All rights Reserved
 *
 * 位运算符的使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181110
 */
public class Demo03 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        byte b1 = 3;
        int b2 = ~b1;
        System.out.println(b2);

        byte b3 = 42 & 15;
        System.out.println(b3);

        byte c = 42 | 15;
        System.out.println(c);

        byte d = 42 | -15;
        System.out.println(d);

        byte b4 = 42 ^ 15;
        System.out.println(b4);

        int num1 = 10;
        int num2 = 11;
        int num3 = 0;
        num3 = num1;
        num1 = num2;
        num2 = num3;

        int a = 10;
        int b = 20 ;
        a = a ^ b;   //a == 30
        System.out.println(a);
        b = a ^ b;  //b == 10
        System.out.println(b);
        a = a ^ b; //a == 20
        System.out.println(a);

        int num01 = 8 << 2;
        System.out.println(num01);

        int num02 = 8 >> 2;
        System.out.println(num02);

        int num03 = -15 >> 1;
        System.out.println(num03);

        int num04 = -15 >>> 1;
        System.out.println(num04);

        int num05 = (int)(12*12.3);
    }
}
