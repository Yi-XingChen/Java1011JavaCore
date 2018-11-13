package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 在控制台输入一个人的年龄，程序给出此人是否为成年人。
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class IfTask01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入年龄：");
        //获取年龄以整型的形式存储
        int age = scanner.nextInt();
        scanner.close();

        if (age > 0 && age < 18) {
            System.out.println("此人未成年！");
        } else if (age >= 18 && age < 200) {
            System.out.println("此人已成年！");
        } else {
            System.out.println("输入有误！请重新输入！");
        }
    }

}
