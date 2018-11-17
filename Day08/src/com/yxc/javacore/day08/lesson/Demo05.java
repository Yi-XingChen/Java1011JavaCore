package com.yxc.javacore.day08.lesson;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java方法的使用测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Demo05 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();
        scanner.close();

        Calc calc = new Calc();
        String daoxuString = calc.daoxuTest(num);
        System.out.println("倒叙产生的结果为：" + daoxuString);
    }
}
