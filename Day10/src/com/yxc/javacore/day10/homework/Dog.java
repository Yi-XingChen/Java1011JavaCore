package com.yxc.javacore.day10.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 定义一个狗类，狗的属性（姓名，颜色，年龄），好吃爱睡觉好玩耍，再定义金毛狗和泰迪狗，它们都继承狗。
 * 尝试将狗的一些属性或者行为定义为private或者protected的，查看这些属性能否被子类继承使用。
 *
 * @author 3342
 * @version 1.0
 * @date 2018118
 */
public class Dog {
    protected String name;

    public String color;

    public byte age;

    public void eat() {
        System.out.println("喜欢啃大骨头！");
    }

    public void sleep() {
        System.out.println("喜欢睡懒觉！");
    }

    public void play() {
        System.out.println("喜欢玩");
    }
}
