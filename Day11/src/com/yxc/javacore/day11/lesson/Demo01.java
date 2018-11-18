package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * POJO类使用测试
 *
 * @author 3342
 * @version 1.0
 * @date 2018118
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
//        student.id = 111;
        student.setId(11);
        int id = student.getId();

    }
}
