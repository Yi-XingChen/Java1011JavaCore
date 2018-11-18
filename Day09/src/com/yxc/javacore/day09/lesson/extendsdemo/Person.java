package com.yxc.javacore.day09.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java的继承实现，Person父类
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Person {
    public int id;

    public String name;

    public String sex;

    public int age;

    /**
     * 定义一个私有的成员变量
     */
    private double height;

    /**
     * 定义一个包访问权限（default）的成员变量
     */
    double weight;

    /**
     * 定义一个保护权限的成员变量
     */
    protected String birthday;

    public Person() {

    }

    public void eat() {
        this.height  = 111.11;
        //包访问权限，在类的内部能够访问
        this.weight  = 12.23;
        //保护权限，在类的内部能够访问
        this.birthday = "20181111";
        System.out.println("吃饭方法");
    }

    public void speak() {
        this.height  = 111.11;
        System.out.println("说话方法");
        System.out.println("都挺会说的");
    }

}
