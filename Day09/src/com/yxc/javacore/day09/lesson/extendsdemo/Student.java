package com.yxc.javacore.day09.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java的继承实现，Student子类
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
//public class Student extends Demo02,Person {
public class Student extends Person {
    public String schoolName;

    public void study() {
        /*
        父类Person当中的成员变量height为private私有权限，在其子类当中不能使用
        成员变量id为public公共权限，在其子类当中能使用
         */
        id = 12;
        //height  = 111.11;

        weight = 123;

        /*
         *保护权限在同一个包底下的子类当中能够使用
         */
        birthday = "201988";
        System.out.println("学习方法");
    }
}
