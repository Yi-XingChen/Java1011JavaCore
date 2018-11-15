package com.yxc.javacore.day05.lesson;

/**
 * Copyright(c)2018 YCKJ. All rights Reserved
 *
 * if语句结构
 *
 * @author 3342
 * @version 1.0
 * @date 20181110
 */
public class IfDemo02 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        int num01 = 0;
        if(10 > 9){
            num01 = 11;
            System.out.println("哈哈哈");
            System.out.println(num01);
        }
        System.out.println(num01);

        if(10 > 9)
            System.out.println("哈哈哈");

        if(10 > 9){
            int num = 11;
        }

        /*
         * 当if语句当中只有一条语句时，一般情况下可以进行花括号的省略；
         * 但是这条语句如果是变量的声明，则不允许进行花括号的省略
         */
        /*if(10 > 9)
            int num02 = 12;*/
    }
}
