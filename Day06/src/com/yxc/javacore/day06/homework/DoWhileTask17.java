package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 使用do-while语句实现100到200间奇数的和
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class DoWhileTask17 {
    /**
     * 计算100到200的奇数和
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        do {
            if (num % 2 != 0) {
                sum = sum + num;
            }
            num++;
        } while (num < 200);
        System.out.println("100~200之间的奇数和：" + sum);
    }
}
