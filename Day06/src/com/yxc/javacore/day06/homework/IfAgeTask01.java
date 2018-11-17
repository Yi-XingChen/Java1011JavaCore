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
public class IfAgeTask01 {
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

        /*
        1.通过死循环来实现不断让用户输入年龄值得需求
        2.对输入进来的年龄进行合法性校验，如果不在0到150的正常范围内，
        则提示不合法，要求重新输入
        3.如果输入的年龄在合法范围内，则判断该年龄是否成年，将判断的结果输出，
        并通过break结束死循环
         */
        while (true) {
            if (age > 0 && age < 18) {
                System.out.println("此人未成年！");
                break;
            } else if (age >= 18 && age < 150) {
                System.out.println("此人已成年！");
                break;
            } else {
                System.out.println("输入有误！请重新输入！");
                age = scanner.nextInt();
                //continue;
            }
        }
        //释放资源
        scanner.close();
    }

}
