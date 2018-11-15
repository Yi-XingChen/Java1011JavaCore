package com.yxc.javacore.day05.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 读取一个学生的姓名、性别、年龄、学校、院系、联系方式等基础信息，并统一做输出。
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Task02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请您输入学生性别：");
        String sex = scanner.next();
        System.out.println("请您输入学生年龄：");
        int age = scanner.nextInt();
        System.out.println("请您输入学生就读学校：");
        String school = scanner.next();
        System.out.println("请您输入学生就读院系：");
        String college = scanner.next();
        System.out.println("请您输入学生联系方式：");
        String tel = scanner.next();
        scanner.close();

        System.out.println("姓名：" + name + " 性别：" + sex
                + " 年龄：" + age + " 就读学校：" + school
                + " 就读院系：" + college + " 联系方式：" + tel
        );
    }
}
