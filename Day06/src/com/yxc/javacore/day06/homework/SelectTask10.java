package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 根据给定的年龄判断是未成年人，青年人，中年人还是老年人
 * （从控制台输入年龄，先判断是否是合法数据）。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class SelectTask10 {
    /**
     * 判断年龄所处的阶段
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        scanner.close();

        if(age > 0 && age < 200) {
            if(age >= 60) {
                System.out.println("老年人");
                return;
            } else if (age >= 35) {
                System.out.println("中年人");
                return;
            } else if (age >= 18) {
                System.out.println("青年人");
                return;
            } else {
                System.out.println("未成年人");
                return;
            }
        }
    }
}
