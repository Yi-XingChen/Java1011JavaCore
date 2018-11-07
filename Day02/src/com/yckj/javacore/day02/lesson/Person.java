package com.yckj.javacore.day02.lesson;

/**
 * Copyright(c)2018 YXC.All right Reserved
 * <br>
 * 人类的数据模型
 *<br>
 * @author 3342
 * @version 1.0
 * @date 20181107
 */
public class Person {
    /**
     * 人的姓名，String为Java语言当中的字符串
     */
    public String name;

    /**
     * 人的性别，Boolean为Java语言当中代表真假的数据类型
     * true 为男
     */
    public boolean sex;

    /**
     * 人的年龄，int为Java当中的整数数据类型，整型（默认）
     */
    public int age;

    /**
     * 人的身高，double为Java当中的小数数据类型，双精度浮点型
     */
    public double height;

    /**
     * 获取身高值
     * @return 返回身高值
     */
    public double getHeight() {
        return this.height;
    }
    /**
     * 人的体重
     */
    public double weight;

    /**
     * 吃饭方法
     */
    public void eat() {
        System.out.println("吃法的方法");
    }

    /**
     * 睡觉的方法
     */
    public void sleep() {
        System.out.println("睡觉的方法");
    }

    /**
     * 读书的方法
     */
    public void read() {
        System.out.println("读书");
    }

}

class Student {
    public int stuId;
    public String name;
    public boolean sex;
    public int age;

    public void study() {
        System.out.println("我爱学习");
    }
}

class Teacher {
    public int TeaId;
    public String name;
    public boolean sex;
    public int age;
}
