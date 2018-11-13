package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 生成一个4行5列的星星（*）图案，以及5/4/3/2/1递减的星星图案
 *
 * @author 3342
 * @version 1.0
 * @date 20181113
 */
public class Task22 {
    /**
     * 星星图案
     *
     * @param args
     */
    public static void main(String[] args) {
        //4行5列
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();//分隔开
        //递减
        for (int m = 0; m < 6; m++) {
            for (int n = 0; n < (5-m); n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
