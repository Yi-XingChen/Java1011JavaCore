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
        System.out.println("请您输入一个整数：");
        int num = scanner.nextInt();
        scanner.close();

        /*for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }*/
        //理解有误，不是递减输出，是逆序输出
        /*
        问题：
        1.如何判断它是几位数的，判断之后如何将它们分开
        2.判断输入的数是否为整数
        3.能否用二进制来处理这个问题
         */

        //这样算的话不是0开头的数会多一个0
        /*int b=1;
        for (int i = 0; b > 0; i++) {
            int d = (int) Math.pow(10, i);
            int a = num/d;
            b = a % 10;
            System.out.print(b);
        }*/

        if(num < 0) {
            num = -num;
            System.out.print("-");
        }
        for(;num > 0;){
            int a = num % 10;
            System.out.print(a);
            num = num / 10;
            /*if(num <= 0){
                break;
            }*/
        }
    }
}
