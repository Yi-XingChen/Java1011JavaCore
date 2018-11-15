package com.yxc.javacore.day05.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 从控制台输入一个矩形的宽和高，求其面积和周长
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Task05 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入矩形的宽和高：");
        int wide = scanner.nextInt();
        int height =scanner.nextInt();
        scanner.close();

        System.out.println("矩形的面积为：" + wide*height);
        System.out.println("矩形的周长为：" + 2*(wide+height));
    }
}
