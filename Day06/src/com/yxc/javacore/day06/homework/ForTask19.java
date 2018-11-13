package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 统计1~100之间是7的倍数的数的个数，并打印输出
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class ForTask19 {
    /**
     * 统计100以内7的倍数的个数
     *
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;//统计个数
        for(int i = 1;i <= 100; i++) {
            if (i % 7 == 0) {
                sum += 1;
            }
        }
        System.out.println("1~100之间是7的倍数的数的个数有" + sum + "个");
    }
}
