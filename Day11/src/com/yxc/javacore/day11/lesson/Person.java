package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：static静态关键字的使用
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/21
 */
public class Person {
    public int id;

    public String name;

    public int age;

    public String sex;

    /*使用static修饰之后就变成了类变量、静态成员变量、静态属性;
    调用时，用 类名.静态属性 形式
     */
    public static String schoolName = "太原工业大学";

    /*
    静态关键字不允许修饰构造函数
     */
    /*public static Person() {

    }*/

    public void eat() {
        //静态关键字不允许修饰局部变量
//        static int num = 1;
        System.out.println("吃方法");
    }

    public void sleep() {
        schoolName = "太原理工大学";
        Person.info();
        info();
        System.out.println("睡觉方法");
    }

    /**
     * 静态方法当中不能使用非静态的成员变量，并且不能使用this关键字，
     * 更不能使用super关键字
     *
     */
    public static void info() {
        System.out.println("静态方法");
        //类名调用，没有对象，this找不到对象；类一旦加载，this就加载了，此时对象还没创建出来，优先于new关键字
        /*
        被static修饰的方法是静态方法，在静态方法中不能使用this关键字，
        也就是说不能使用类的成员变量，因为静态方法随着类的加载而加载，在类进行加载时，
        对象还没有创建，当前的成员变量并没有特定的对象所引用
         */
        //System.out.println("id:" + this.id + ",age = " + this.age);
        //System.out.println("id:" + id + ",age = " + age);

        /*
        静态方法中能够使用静态的成员变量，原因是静态成员变量也是在类加载时
        就进行加载的，加载成员方法时，该静态成员变量已经完成了初始化，所以能够引用
         */
        //System.out.println("schoolName:" + this.schoolName);
    }
}
