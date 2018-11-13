package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 使用for循环输出如下所示的加法表：
 * 请输入一个整数：6
 * 该值的加法表如下：
 * 0+6=6
 * 1+5=6
 * 2+4=6
 * 3+3=6
 * 4+2=6
 * 5+1=6
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class ForTask18 {
    /**
     * 加法表
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = 0;
        /*
        判断控制台接收是否为数字,当在控制台输入一个字符的时候,
        hasNextInt()判断输入这个字符是不是数字，而不是接收值，
        当if判断通过之后执行接收
         */
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            System.out.println("根据这个数可以输出以下加法表：");
            for (int i = 0; i < num; i++) {
                System.out.println(i + "+" + (num - i) + "=" + num);
            }
        }else{
            System.out.println("格式错误，请输入一个整数");
        }

    }
}
