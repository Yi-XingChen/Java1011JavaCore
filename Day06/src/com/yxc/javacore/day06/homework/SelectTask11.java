package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 买饮料的业务。一杯饮料6.00元，最少买一杯，半杯不卖，一杯以上半价。
 * 输入要买的饮料的瓶数，输出花费的钱数。（用if 语句或者if...else 语句）。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class SelectTask11 {
    /**
     * 计算买饮料的金额
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请问您要买几杯");
        int cup = scanner.nextInt();
        scanner.close();

        int money;

        //方法一
       /* if (cup > 1) {
            money = cup * 3;
            System.out.println("总共" + money + "元");
        } else if(cup == 1) {
            System.out.println("总共6元");
        } else {
            System.out.println("对不起，我们不卖半杯");
        }*/

        //方法二
       /*if (cup >0 ) {
           if (cup == 1) {
               System.out.println("花费6元");
           } else {
               money = cup * 3;
               System.out.println("总共花费" + money + "元");
           }
       }else {
           System.out.println("花费0元");
       }*/

        //方法三
        if (cup <= 0) {
            System.out.println("花费0元");
        }
        if (cup == 1) {
            System.out.println("花费6元");
        }
        if (cup > 1) {
            System.out.println("花费" + cup * 3 + "元");
        }
    }
}
