package com.yxc.javacore.day09.lesson;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 类的构造函数
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student(12);
        System.out.println(student.stuId);

        Student student2 = new Student(11,"zhangsan");
        System.out.println(student2.stuId + "-----" + student2.name);

        Student student3 = new Student(13,"lisi");


        Student student1 = new Student();
        //为什么调用的不是类那个,因为默认构造函数会被覆盖，所以在这调用时需要和显示的构造函数类型一致
        String string = new String("12342");
        Scanner scanner = new Scanner(System.in);
    }
}
