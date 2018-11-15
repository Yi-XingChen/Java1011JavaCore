package com.yxc.javacore.day05.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 学生数据模型类
 *
 * @author 3342
 * @version 1.0
 * @date 20181109
 */
public class Student {
    public int stuId;

    public String name;

    public boolean sex;

    public byte age;

    public float height;

    public double weight;

    public long longNum;

    public short shortNum;

    public char char1;

    public void info() {
        System.out.println("这是一个学生");
    }

    public void study() {
        System.out.println("学习");
    }
}
