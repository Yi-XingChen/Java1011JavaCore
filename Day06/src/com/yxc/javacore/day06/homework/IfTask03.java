package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 给定年份，输出当年是闰年还是平年。
 * 闰年：能被4整除且不能被100整除或者能被400整除的年份。
 * 如2004年就是闰年，1900年不是闰年。
 * 世纪年能被400整除的是闰年，如2000年是闰年，1900年不是闰年。
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class IfTask03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入年份：");
        int year = scanner.nextInt();
        scanner.close();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("该年份是闰年");
        } else {
            System.out.println("该年份是平年");
        }
    }
}
