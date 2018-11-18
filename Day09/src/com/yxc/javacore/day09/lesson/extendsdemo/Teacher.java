package com.yxc.javacore.day09.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Java的继承实现，Teacher子类
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
//访问权限修饰符修饰类时，只能使用public以及default（包括包访问权限）
//private class Teacher extends Person{
//protected class Teacher extends Person{
//class Teacher extends Person{
public class Teacher extends Person{
    public String schoolName;

    public void teach() {
        System.out.println("教书方法");
    }
}
