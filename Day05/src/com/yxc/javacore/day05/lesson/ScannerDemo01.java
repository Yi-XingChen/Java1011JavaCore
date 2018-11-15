package com.yxc.javacore.day05.lesson;

import java.sql.Date;
import java.util.Scanner;

/**
 * Copyright(c)2018 YCKJ. All rights Reserved
 *
 * 控制台交互式编程
 * Scanner类的next方法的使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181110
 */
public class ScannerDemo01 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int num = scanner.nextInt();
        System.out.println(num);*/

        byte f1 = (byte)scanner.nextInt();
        System.out.println(f1);
        /*boolean b1 = scanner.nextBoolean();
        System.out.println(b1);*/

        /*System.out.println("请输入你的姓名：");
        String name = scanner.next();
        //String name = scanner.nextLine();

        System.out.println("请输入你的性别：");
        String sex = scanner.next();

        System.out.println("请输入你的年龄：");
        String age = scanner.next();

        System.out.println("我的姓名是：" + name
                + ",性别是：" + sex
                + ",年龄是：" + age);*/

        scanner.close();

        java.util.Date date = new java.util.Date();

        Date date1 = new Date(10);
    }
}
