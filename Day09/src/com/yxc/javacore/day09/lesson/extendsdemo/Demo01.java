package com.yxc.javacore.day09.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java的继承实现
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
        Student student  = new Student();
        student.schoolName = "太原科技大学";
        student.study();

        student.id = 11;
        student.age = 18;
        student.speak();


        Teacher teacher = new Teacher();
        teacher.schoolName = "太原工业大学";
        teacher.teach();

        teacher.id = 12;
        teacher.speak();
    }
}
