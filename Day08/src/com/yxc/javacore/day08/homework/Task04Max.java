package com.yxc.javacore.day08.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 创建一个方法可以找出三个数的最大值。
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Task04Max {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("请输入三个正整数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        Max01 max01 = new Max01();
        int max = max01.Max(a, b, c);
        System.out.println(max);
    }
}

class Max01 {
    /**
     * 找出三个数的最大值
     * @param a 正整数1
     * @param b 正整数2
     * @param c 正整数3
     * @return 返回最大值
     */
    int Max(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        }
        if (b > c && b > a) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        return max;
    }
}