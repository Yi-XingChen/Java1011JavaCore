package com.yxc.javacore.day06.lesson;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 *
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class SwitchDemo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1到12之间的月份：");
        String str = scanner.next();
        scanner.close();

        switch (str) {
            case "1":
            case "2":
            case "3":
                System.out.println("春季");
                break;
            case "4":
            case "5":
            case "6":
                System.out.println("夏季");
                break;
            case "7":
            case "8":
            case "9":
                System.out.println("秋季");
                break;
            case "10":
            case "11":
            case "12":
                System.out.println("冬季");
                break;
        }
    }
}
