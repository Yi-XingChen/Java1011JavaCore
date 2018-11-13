package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 设计简易计算器,从键盘上输入一个整数，一个操作符，第二个整数，
 * 如12 + 34，输出计算结果(switch表达式为String类型)
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class SwitchTask07 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入一个“数字 符号 数字”形式的表达式，数字为整数，符号为+-*/中的一个");
        int a = scanner.nextInt();
        String cal = scanner.next();
        int b = scanner.nextInt();
        scanner.close();

        int result = 0;
        switch (cal) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("您输入的符号不合理，请重新输入");
                return;
        }
        System.out.println(a + cal + b + "=" + result);
    }
}
