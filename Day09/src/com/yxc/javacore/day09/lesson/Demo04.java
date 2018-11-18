package com.yxc.javacore.day09.lesson;

import com.yxc.javacore.day09.lesson.extendsdemo.Person;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java的访问权限修饰符的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Demo04 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 123;
//        person.height = 12.23;

        /*
        weight成员变量为default包访问权限，在同包当中允许访问，
        不在同包中不允许访问；Demo04与Person类不在同一个包当中，
        不允许访问weight属性
         */
//        person.weight = 12.3;

        /*
        birthday为Person类当中的保护权限的成员变量，Demo04与Person类不在同一个包下，
        即便是保护权限，也不能访问；
        在不同包下创建的对象，不能够使用保护权限的成员变量
         */
//        person.birthday = "2018222";

    }

}
