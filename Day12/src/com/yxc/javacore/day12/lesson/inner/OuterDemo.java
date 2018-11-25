package com.yxc.javacore.day12.lesson.inner;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：内部类的使用测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public class OuterDemo {
    public int id;

    public String name;

    public int age;

    public void eat() {
        System.out.println("吃的方法");
    }

    public void sleep() {
        System.out.println("睡觉方法");
    }

    public void info() {
        System.out.println("外部类的展示信息方法");
        //InnerDemo innerDemo = new InnerDemo();
        //this.InnerDemo innerDemo = this.new InnerDemo();
        InnerDemo innerDemo = this.new InnerDemo();
        OuterDemo.InnerDemo innerDemo1 = this.new InnerDemo();
        innerDemo1.innerId = 12;
        innerDemo1.innerInfo();
    }

    /**
     * OuterDemo类的内部类InnerDemo。
     *
     * 对于内部类而言，它相当于类的一个部分，与成员变量、成员方法相类似，
     * 因此，可以使用public，protected、default、private四种访问权限，
     * 每种权限的作用方式与修饰成员变量、成员方法也类似。
     */
    public class InnerDemo {
    // private class InnerDemo {
        public int innerId;

        /**
         * 内部类的id属性，与外部类的id属性同名
         */
        public int id;

        public String innerName;

        public int innerAge;

        //非静态的内部类中不能声明静态的成员方法与成员变量
        //public static String className;
        /*public static void innerStaticInfo() {
            System.out.println("方法");
        }*/

        public void innerInfo() {
            //内部类的方法能够访问外部类的成员方法与成员变量
            /*id = 123;
            age = 15;
            info();*/

            int id = 1010;
            id = 12;
            //该id为内部类对象的成员变量
            this.id = 123;
            //该id为内部类对象归属的外部类对象的成员变量
            OuterDemo.this.id = 111;


            System.out.println("内部类展示信息方法");
        }
    }


}
