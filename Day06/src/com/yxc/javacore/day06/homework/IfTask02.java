package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 判断一个整数是奇数还是偶数
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class IfTask02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入一个整数:");
        int num = scanner.nextInt();
        scanner.close();

        //方法1
        if(num % 2 == 0) {
            System.out.println("该数为偶数");
        } else {
            System.out.println("该数为奇数");
        }

        //方法2
        /*switch (num % 2) {
            case 0:
                System.out.println("该数为偶数");
                break;
            case 1:
                System.out.println("该数为奇数");
                break;
            default:
                System.out.println("您输入的数字有误，请重新输入");
                break;
        }*/
    }
}
