package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 从键盘上输入一个数，逆序输出
 *
 * @author 3342
 * @version 1.0
 * @date 20181113
 */
public class Task24 {
    /**
     * 逆序输出
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入一个正整数");
        int num = scanner.nextInt();
        scanner.close();

        for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
