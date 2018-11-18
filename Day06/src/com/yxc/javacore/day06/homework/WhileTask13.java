package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 在控制台输入任意多个正整数，输入-1标识结束,找到这些数中的最大数。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class WhileTask13 {
    /**
     * 找一堆整数中的最大数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //保存键盘上输入的整数
        int num = 0;
        //保存最大数
        int max = 0;

        while( num != -1) {
            System.out.println("请输入一个正整数, 输入-1表示结束!");
            num = sc.nextInt();
            if(num < 0 && num != -1) {
                System.out.println("您输入的值不合法！");
                continue;
            }
            //判断num是否为最大数
            if( num > max ){
                max  = num;
            }
        }
        sc.close();

        //输出最大值
        System.out.println("max == " + max );
    }
}
