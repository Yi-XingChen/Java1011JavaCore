package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 交通红绿灯的实现，如果是绿灯就走，红灯就停，黄灯就等，
 * 通过switch表达式为枚举类型实现。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */

public class SwitchTask08 {
    /**
     * 主函数
     *
     * @param args
     */
    /*public static void main(String[] args) {
        //从键盘上接收一个字符串,把这个字符串转换为枚举类型值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 Red, Yellow, Green 中的一个");
        String text = sc.next();//"Red"
        TrafficLight light = TrafficLight.valueOf(text);//可以把字符串转换为枚举类型值
        System.out.println(light);

        //根据用户输入的信号灯判断走还是停
        switch (light) {
            case Red:
                System.out.println("停");
                break;
            case Yellow:
                System.out.println("等");
                break;
            case Green:
                System.out.println("走");
                break;
        }
    }

    *//**
     * 1) 使用enum定义一个枚举类型,这个类型的名字是TrafficLight
     * 2) 使用TrafficLight类型定义变量,这个变量的取值只能是Red, Yellow, Green中的一个
     *//*
    enum TrafficLight {
        Red, Yellow, Green
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入red yellow green中的一个");
        String light = scanner.next();
        scanner.close();

        switch (light) {
            case "red":
                System.out.println("停");
                break;
            case "yellow":
                System.out.println("等");
                break;
            case "green":
                System.out.println("行");
                break;
            default:
                System.out.println("您输入的值不合法，请重新输入");
                break;
        }
    }

}
