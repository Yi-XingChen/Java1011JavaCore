package com.yxc.javacore.day12.lesson.inner;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：静态内部类的使用测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public class OuterStaticDemo {
    public int id;

    public String name;

    public int age;

    public static String className;

    public void info() {
        OuterStaticDemo.className = "Java1011";
        className = "Java1011";
        //this.className = "Java1011";
        OuterStaticDemo.staticInfo();
        InnerStaticDemo innerStaticDemo = new OuterStaticDemo.InnerStaticDemo();
        InnerStaticDemo innerStaticDemo1 = new InnerStaticDemo();
        //静态内部类在外部类成员方法当中创建对象，不能用this关键字创建
//        InnerStaticDemo innerStaticDemo1 = this.new InnerStaticDemo();
//        InnerStaticDemo innerStaticDemo2 = new OuterStaticDemo();
        System.out.println("外部类展示信息方法");

        /*
        外部类不能直接访问内部类的成员变量和方法，由于静态内部类也是一个类
        对于该类的访问，只能通过创建对象对象去访问成员变量和成员方法
         */
        //innerName = "zhagnsan";
        innerStaticDemo.innerAge = 11;
    }

    public static void staticInfo() {
//        age = 111;
        System.out.println("外部类的静态方法");
        InnerStaticDemo.innerClassName = "innerJava1011";
    }

    /**
     * 外部类OuterStaticDemo的静态内部类InnerStaticDemo
     * static关键字能够修饰内部类,不能修饰基础类（外部类）
     */
    public static class InnerStaticDemo {
//    private static class InnerStaticDemo {

        public int innerId;

        public String innerName;

        public int innerAge;

        /**
         * 在静态内部类当中声明一个静态的成员变量
         */
        public static String innerClassName;

        public void innerInfo() {
            /*
            静态内部类不能访问外部类的非静态成员
            静态内部类相当于是外部类的一个静态成员，静态内容不能访问非静态的内容
             */
            /*age = 11;
            info();*/
            System.out.println("内部类的信息展示方法");


            /*
            静态内部类当中能够访问外部类的静态成员变量和成员方法
             */
            className = "Java1011";
            staticInfo();
            OuterStaticDemo.className = "Java1011";
            OuterStaticDemo.staticInfo();

            //在静态内部类当中访问自身的静态成员变量
            innerClassName = "InnerJava1011";
        }
    }

}
