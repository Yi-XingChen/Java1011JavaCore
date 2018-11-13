package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * break语句的goto功能
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class BreakDemo02 {
    public static void main(String[] args) {
        first:for (int i = 1; i <= 10; i++) {
            System.out.println("i:" + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println("j:" + j);
                if (j == 3) {
                    break first;
                }
            }
        }
        System.out.println("程序结束");
    }
}
