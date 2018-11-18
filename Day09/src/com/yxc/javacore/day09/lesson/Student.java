package com.yxc.javacore.day09.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
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

    @Override
    public void finalize() {
        System.out.println("当前的Student类对象要被GC销毁了！");
    }

    //构造函数，与类名一样

    /**
     * 在Java类当中，如果不显式定义构造函数，JVM默认会给当前类提供一个
     * 无参的空构造函数；如果显式定义一个构造函数，该构造函数会覆盖掉之前JVM默认
     * 提供的无参构造函数；为了保证代码的安全性，一般情况下，
     * 我们显式定义构造函数时，都会将默认的无参构造函数也同时定义出来
     */
    public Student() {
        //能使用return关键字，但是不能用return返回值
        return;
//        return 0;

    }

//    public static Student(int id) {
    public Student(int id) {
        this();
        stuId = id;
    }

    /*public Student(int stuId) {

    }*/ //参数的个数不同、或参数类型不同、或参数顺序不同

    public Student(int stuId,String name) {
        /*stuId = id;
        name = toName;*/
//        System.out.println("123");
        /*this()只能出现在构造函数的首行，
        原因是：当出现this()时，是一个构造函数去调用另外一个构造函数，
        而对象的真正创建是由内部的构造函数决定的，
        该内部构造函数去堆内存当中初始化出一个内存块来，对象没有创建
        是无法调用对象属性的，所以该函数必须在首行
         */
        this(stuId);
        this.stuId = stuId;//this：当前调用者的对象
        this.name = name;
        System.out.println("我是带有形参的构造函数");
    }

    public void info() {
        this.stuId = 100;
        System.out.println(this.stuId);
        this.study();
        System.out.println("这是一个学生");
    }

    public void study() {
        this.age = 100;
        System.out.println("学习");
    }
}
