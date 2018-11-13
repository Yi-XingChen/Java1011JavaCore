package com.yxc.javacore.day06.lesson;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 *     switch语句块测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class SwitchDemo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建一个Scanner类型的对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1到7之间的字符串:");
        //获取控制台输入的值
        String string = scanner.next();
        int num = scanner.nextInt();
//        byte num = scanner.nextByte();

        scanner.close();

        /*switch (string) {
            case "1":
                System.out.println("星期一");
                break;
            case "2":
                System.out.println("星期二");
                break;
            case "3":
                System.out.println("星期三");
                break;
            case "4":
                System.out.println("星期四");
                break;
            case "5":
                System.out.println("星期五");
                break;
            case "6":
                System.out.println("星期六");
                break;
            case "7":
                System.out.println("星期日");
                break;
            default:
                System.out.println("您输入的字符串不合法！");
                break;
        }*/

        //自动类型提升
        /*if(num == 1) {

        }*/

        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
//            System.out.println("123");在break后面不能加语句
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            //default语句块并不要求一定放在switch语句的最后一个部分
            default:
                System.out.println("您输入的字符不合法！");
                break;
        }
        System.out.println("程序结束！");

    }
}
