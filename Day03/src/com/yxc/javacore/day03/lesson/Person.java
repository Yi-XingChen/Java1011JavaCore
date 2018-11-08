package com.yxc.javacore.day03.lesson;

/**
 * Copyright(c)2018 YXC.All right Reserved
 * <br>
 * 人类的测试用例
 *
 * @author 3342
 * @version 1.0
 * @date 20181108 14:19
 */
public class Person {
    public int id = 12;
    //全局变量一样不能重名
//    public int id = 15;
    public static String name;
    public boolean sex;
    public int age;
    public double height;

    public void eat() {
        System.out.println("吃饭方法");
    }

    public void sleep() {
        //成员方法中也可以调用
        /*Person person = new Person();
        System.out.println(person.id);*/
        /*
         *在成员方法中，可以直接访问类的成员变量（全局变量）
         * 不管成员变量是否赋初始值，都可以直接使用
         */
//        System.out.println(id);
        //this 指的是对象
        System.out.println(this.id);
        System.out.println(name);
        System.out.println("睡觉的方法");
    }

    public void info() {
        int num01 = 11;
        //局部变量与全局变量可以同名
        int id = 15;
        //不加this的Id，代表局部变量id
        System.out.println("id:" + id);
        //添加this的id，代表全局变量id，通过this来区分同名的全局变量和局部变量
        System.out.println("this.id:" + this.id);
    }

    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        /*int num = 12;
        int num01;
        System.out.println(num01);*/

        //主函数中不能直接使用全局变量
//        System.out.println(name);
        //调用方式1：通过对象来调用对象的成员变量
        Person person = new Person();
        System.out.println(person.name);

        //调用方式二：通过给成员变量添加静态修饰符static，让该成员变量变成静态变量
        System.out.println(name);

        //在主函数当中，声明局部变量时，变量名不能重名
        /*int num01 = 12;
        int num01 = 13;*/

        person.info();

    }
}
