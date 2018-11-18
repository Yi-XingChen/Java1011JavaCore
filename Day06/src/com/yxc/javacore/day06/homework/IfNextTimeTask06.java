package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 从键盘上输入一个时间， 输出这个时间的下一秒。
 * 例如键盘输入10 11 12三个数字，代表时分秒，表示:10:11:12，它的下一秒为10:11:13。
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */

public class IfNextTimeTask06 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入一个时间，即三个整数");
        byte hour = scanner.nextByte();
        byte minute = scanner.nextByte();
        byte second = scanner.nextByte();
        scanner.close();

        //如果输入的是23 59 59 ，则输出0 0 0
        if(hour > 23 || minute > 59 || second > 59 || hour < 0 || minute < 0 || second < 0) {
            System.out.println("输入有误！");
            return;
        }else if (hour < 24) {
            if (minute < 60) {
                if (second < 60) {
                    second += 1;
                    if (second == 60) {
                        second = 0;
                        minute += 1;
                    }
                    if (minute == 60) {
                        minute = 0;
                        hour += 1;
                    }
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }
        }

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
