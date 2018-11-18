package com.yxc.javacore.day09.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java垃圾回收机制
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class GCDemo {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student = new Student();

        System.gc();
        System.out.println(student);

        System.gc();
    }
}
