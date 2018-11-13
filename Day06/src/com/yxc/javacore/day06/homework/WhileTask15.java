package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 使用while进行累加操作，输出从1到100累加的和。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class WhileTask15 {
    /**
     * 计算1到100的累加和
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("累加和为：" + sum);
    }
}
