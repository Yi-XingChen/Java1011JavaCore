package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java的继承实现，Person父类
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Person {
    public int id = 100;

    public String name;

    public String sex;

    public int age;

    /**
     * 定义一个私有的成员变量
     */
    private double height;

    /**
     * 定义一个保护权限的成员变量
     */
    protected String birthday;

    /**
     * 父类无参构造函数显示定义
     */
    public Person() {

    }

    /**
     * 带有两个参数的构造函数
     * @param name
     * @param sex
     */
    public Person(String name,String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void eat() {
        System.out.println("吃饭方法");
    }

    public void speak() {
        System.out.println("说话方法");
        System.out.println("都挺会说的");
    }

}
