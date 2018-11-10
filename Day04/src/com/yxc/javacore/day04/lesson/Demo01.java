package com.yxc.javacore.day04.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 测试类成员变量的基础数据类型默认值
 *
 * @author 3342
 * @version 1.0
 * @date 20181109
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = student1;
        System.out.println(student);
        //验证student1与student2是否为同一个对象
        System.out.println(student1);
        System.out.println(student2);
        student1.stuId = 12;
        System.out.println(student2.stuId);

        //boolean默认值为false
        System.out.println("boolean:" + student.sex);
        //byte默认值为0
        System.out.println("byte:" + student.age);
        //short默认值为0
        System.out.println("short:" + student.shortNum);
        //int默认值为0
        System.out.println("int:" + student.stuId);
        //long默认值为0
        System.out.println("long:" + student.longNum);
        //float默认值为0.0
        System.out.println("float:" + student.height);
        //double默认值为0.0
        System.out.println("double:" + student.weight);
        //char默认值为一个什么都不是的单个字符'\u0000'
        System.out.println("char:" + student.char1);
        System.out.println(student.char1 == '\u0000');

        //引用数据类型默认值为null
        System.out.println("String:" + student.name);

    }
}
