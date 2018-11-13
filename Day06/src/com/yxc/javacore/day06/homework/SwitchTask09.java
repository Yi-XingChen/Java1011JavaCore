package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 根据输入月份判断是第几个季度，是什么季节。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class SwitchTask09 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        scanner.close();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("第一季度，春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("第二季度，夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("第三季度，秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("第四季度，冬季");
                break;
            default:
                System.out.println("您输入的月份不合理，请重新输入");
                break;

        }
    }
}
