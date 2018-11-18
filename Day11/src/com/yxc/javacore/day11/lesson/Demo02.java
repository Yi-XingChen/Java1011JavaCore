package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * final关键字的使用
 *
 * @author 3342
 * @version 1.0
 * @date 2018118
 */
public class Demo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 11;
        num = 12;

        final int NUM = 11;
//        NUM = 12;

        Student student = new Student();
        //student.num = 12;



    }
}
