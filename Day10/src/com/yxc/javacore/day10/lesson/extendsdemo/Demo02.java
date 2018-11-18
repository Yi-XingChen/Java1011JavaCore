package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 继承过程当中的构造函数
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Demo02 {
    public static void main(String[] args) {
        Student student = new Student();
       //student.id = 122;
        student.setSonId(12);
        student.setFatherId(122);

        int sonId = student.getSonId();
        System.out.println(sonId);
        int fatherId = student.getFatherId();
        System.out.println(fatherId);

    }
}
