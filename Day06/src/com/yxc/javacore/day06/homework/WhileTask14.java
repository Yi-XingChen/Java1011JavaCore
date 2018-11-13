package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 使用WHILE循环比较两个数字num1和num2，num1初始值为80，num2的值为90，
 * num1循环加1，当num1等于num2时退出循环，打印出num1的值。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class WhileTask14 {
    /**
     * 比较两个数
     *
     * @param args
     */
    public static void main(String[] args) {
        //初始化语句
        int num1 = 80;//声明一个变量并初始化，赋给初始值80
        int num2 = 90;//声明一个变量并初始化，赋给初始值90
        while(num1 < num2)
            num1++;//循环体里就只有num1++;会一直执行num1++直到不满足while判断的条件跳出循环
        System.out.println(num1);//循环执行完后，num1的值为90

    }
}
