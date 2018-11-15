package com.yxc.javacore.day05.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 关系运算符
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(6 < 3);
        boolean b1 = false == true;
        System.out.println(b1);

        boolean b2 = false != true;
        System.out.println(b2);

        /*
         * 关系运算符比较引用数据类型时，比较的是内存地址，
         * 判断当前的两个变量是否指向同一个对象
         */
        Student student = new Student();
        Student student1 = new Student();
        System.out.println(student == student1);
        System.out.println(student);
        System.out.println(student1);

        Student student2 = new Student();
        Student student3 = student2;
        System.out.println(student2 == student3);
        System.out.println(student2);
        System.out.println(student3);
    }

}
