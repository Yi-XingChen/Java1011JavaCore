package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 输出100-1000之间的水仙花数。
 * 水仙花数：如果一个三位的正整数，每位数字的立方和等于这个数本身，则此数称为“水仙花数”。
 *
 * @author 3342
 * @version 1.0
 * @date 20181113
 */
public class Task25 {
    /**
     * 输出100-1000之间的水仙花数
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (i == a*a*a + b*b*b + c*c*c) {
                System.out.println(i + "为水仙花数");
            }
        }
    }
}
