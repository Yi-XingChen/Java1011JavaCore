package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 继承中的super、this关键字测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.study();

        student.sex  = "男";
        //student.weight = 12.21;
    }
}
