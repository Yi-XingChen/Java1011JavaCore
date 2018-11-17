package com.yxc.javacore.day08.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 在控制台上输入两个整数，封装一个类，
 * 该类包含了加减乘除四种方法，分别返回对应输入值的四种运算结果。
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Task01Opera {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        //调用算术类
        Operation operation = new Operation();

        int add = operation.Add(a,b);
        System.out.println("两者的和为：" + add);

        int sub = operation.Sub(a,b);
        System.out.println("两者的差为：" + sub);

        int mul = operation.Mul(a,b);
        System.out.println("两者的积为：" + mul);

        int div = operation.Div(a,b);
        System.out.println("两者的商为：" + div);

    }
}

class Operation {
    /**
     * 加法
     *
     * @param a 被加数
     * @param b 加数
     * @return 两者的和
     */
    public int Add(int a, int b) {
        int result = a + b;
        return result;
    }

    /**
     * 减法，大减小
     * @param a 被减数
     * @param b 减数
     * @return 返回两者的差
     */
    public int Sub(int a, int b) {
        int result;
        if (a > b) {
            result = a - b;
        } else {
            result = b - a;
        }
        return result;
    }

    /**
     * 乘法
     * @param a 被乘数
     * @param b 乘数
     * @return 返回两者的积
     */
    public int Mul(int a, int b) {
        int result = a * b;
        return result;
    }

    /**
     * 除法，大除小
     * @param a 被除数
     * @param b 除数
     * @return 两者的商
     */
    public int Div(int a, int b) {
        int result;
        if (a > b) {
            result = a / b;
        } else {
            result = b / a;
        }
        return result;
    }

}
