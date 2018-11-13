package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 使用for循环打印等边三角形
 *
 * @author 3342
 * @version 1.0
 * @date 20181113
 */
public class Task23 {
    /**
     * 打印等边三角形图案
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            for (int j = i+1; j<5; j++) {
                System.out.print(" ");
            }
            for(int t=0; t<=i; t++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
