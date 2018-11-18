package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * POJO类的定义，学生数据模型
 *
 * @author 3342
 * @version 1.0
 * @date 2018118
 */
public class Student {
//public final class Student {
    private int id;

    private String name;

    private String sex;

    private int age;

    private String className;

    //不可变的成员变量名要大写
    public final int NUM = 11;

    //final不可修饰构造方法
    /*public final Student() {

    }*/

    public void eat() {
        System.out.println("吃东西方法");
    }

    public final void study() {
        System.out.println("学习方法");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }

}
