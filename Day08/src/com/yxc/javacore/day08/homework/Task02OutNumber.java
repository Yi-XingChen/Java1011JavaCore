package com.yxc.javacore.day08.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 创建一个类，方法，可以从控制台上输入一个正整数，
 * 可以完成输出每位数字，且求数字和的功能。
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Task02OutNumber {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();
        scanner.close();

        Info info = new Info();
        info.Calc(num);
    }
}

class Info {
    /**
     * 用于计算输入的正整数为多少位数
     *
     * @param num 输入的正整数
     * @return 返回正整数的位数
     */
    public int Wei(int num) {
        int L = 0;
        while (num > 0) {
            num = num / 10;
            L++;
        }
        return L;
    }

    /**
     * 输出每位数字，并计算各个数字的和且输出
     *
     * @param num 输入的正整数
     */
    public void Calc(int num) {
//        System.out.println(num);//确认正整数
        int sum = 0;
        int result;
        int L = this.Wei(num);
        int[] arr = new int[L];
        int i = arr.length - 1;
        System.out.println("输出的数是：");
        while (num > 0) {
            result = num % 10;
//            System.out.println(result);
            arr[i] = result;//保存数字
            sum = sum + result;
            num = num / 10;
            i--;
        }
        //输出各个数字
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("输出的数求和得" + sum);
    }
}
