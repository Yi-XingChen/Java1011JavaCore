package com.yxc.javacore.day09.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java的访问权限修饰符的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 111;
        /*
        height成员变量在其类型创建的对象当中也不能使用（通过对象.成员变量的方式访问），
        但是公共public的变量可以访问
         */
//        person.height = 123.23;

        person.weight = 123;

        person.birthday = "201879";
    }
}
