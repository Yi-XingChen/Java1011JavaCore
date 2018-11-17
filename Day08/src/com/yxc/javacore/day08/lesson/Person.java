package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 面向对象编程思想特性的测试
 * 人类数据模型
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Person {
    public int id;

    public String name;

    public String sex;

    public int age;

    public double height;

    public static final int num = 11;
    /**
     * 通过学校名称来标识一个人的学历
     */
//    public String schoolName;
    public EduInfo eduInfo;//引用数据类型

    public void eat(){
        System.out.println("吃饭方法");
    }

    public void sleep() {
//        System.out.println("睡觉方法");
        String str = "睡觉" + "方法";
        System.out.println(str);
    }

    public void speak() {
        System.out.println("说话方法");
    }


}
