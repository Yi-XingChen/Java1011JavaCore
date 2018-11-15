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
public class Task04 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int  a=4;
        int  b=a++;//b=4,a=5
        int   c=--b+a++;//b=3,a=6,c=8
        boolean  d=c<10&&a-->5&b++>10||++c>10;
        //true&&true &false || false

        System.out.println(a);//5
        System.out.println(b);//4
        System.out.println(c);//9
        System.out.println(d);//false
    }
}
