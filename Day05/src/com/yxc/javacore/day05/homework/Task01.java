package com.yxc.javacore.day05.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 分析程序结果
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Task01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int first = 100;
        int second = 50;
        boolean b = ((first++ + ++second) > 155) && first > 0 || second < 30 & (second++ - --first) < 120;
        //false||false&(51-100)<120 --> false||false&true -->false||false
        System.out.println(first + "," + second + "," + b); //100,52,false
    }
}
