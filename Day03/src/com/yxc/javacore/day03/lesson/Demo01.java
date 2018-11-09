package com.yxc.javacore.day03.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 变量使用的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181108
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 11;
        System.out.println(num);

        //局部变量在主函数当中只做声明不做初始化，不能直接使用
        int num1;
        num1 = 12;
        System.out.println(num1);

        /**
         * 1.在主函数当中，要想访问某个类的成员变量（全局变量）
         * 必须通过该类的对象来进行使用
         * 2.类的成员变量（全局变量），不需要赋初始值，
         * 能够直接使用，会发现这些成员变量自带初始值
         * 3.成员变量的自带初始值与该变量的数据类型有关
         */

//        System.out.println(Person.id);

        Person person = new Person();
        System.out.println(person.id);
        System.out.println(Person.name);
        System.out.println(person.sex);
        System.out.println(person.age);
        System.out.println(person.height);

        Person person1 = new Person();
        System.out.println(person1.id);
        person1.sleep();
    }
}
