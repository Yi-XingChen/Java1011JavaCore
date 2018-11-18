package com.yxc.javacore.day09.lesson;

import com.yxc.javacore.day09.lesson.extendsdemo.Person;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java的继承实现，Teacher子类
 * 测试访问权限修饰符
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Teacher extends Person {
    public void teach() {
        /*
        weight成员变量为父类Person当中的变量，Teacher类与Person类不在同一个包当中，
        而weight变量又是default包访问权限，所以不能访问
         */
//        weight = 123;

        /*
        父类当中声明的保护权限属性，在任意一个子类当中，都能访问；
        不管该子类与父类是否在同一个包下
         */
        birthday = "20181111";
        System.out.println("教书方法");
    }
}
