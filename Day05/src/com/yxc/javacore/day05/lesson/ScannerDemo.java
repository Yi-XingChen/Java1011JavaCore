package com.yxc.javacore.day05.lesson;

import java.util.Scanner;

/**
 * Copyright(c)2018 YCKJ. All rights Reserved
 *
 * 控制台交互式编程
 *
 * @author 3342
 * @version 1.0
 * @date 20181110
 */
public class ScannerDemo {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        String string = new String("1111");

        //创建一个Scanner类型的对象，用来扫描键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");

        //调用Scanner类的next方法来获取输入进来的值
        String name = scanner.next();

        System.out.println("我的姓名是：" + name);

        //调用close方法来释放Scanner对象的相关资源
        scanner.close();
    }
}
