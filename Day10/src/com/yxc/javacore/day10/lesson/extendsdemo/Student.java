package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java的继承实现，Student子类
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Student extends Person {
    public String schoolName;

    /*
    子类当中的成员变量id
     */
    public int id = 10;

    /**
     * 默认无参构造函数显示定义
     */
    public Student() {
        /*在子类的构造函数中调用父类的构造函数，并且super()关键字必须在首行;
        因为子类继承父类，应该先把父类的东西构造好，然后再构造子类的东西。
         */
        //super("无名氏","男");
    }

    public Student(String name,String sex) {
        //super(name,sex);
       // super();
        this();//调用this后就不会隐藏调用super()了
    }

    public void study() {
        int id = 1;
        System.out.println(id); //局部变量的值
        System.out.println(this.id); //当前类的成员变量
        System.out.println(super.id); //父类的成员变量
        System.out.println(super.name);
        //为了规范，应该在属性名前面添加关键字
        System.out.println(this.name);
        //虽然不报错（不报错的原因是JVM底层），但是不规范。只要是可继承的成员变量，都可以使用
        System.out.println(this.schoolName);
        System.out.println("学习方法");
    }

    public int getSonId() {
        return this.id;
    }

    public int getFatherId() {
        return super.id;
    }

    public void setSonId (int sonId) {
        this.id = sonId;
    }

    public void setFatherId(int fatherId) {
        super.id = fatherId;
    }

}
