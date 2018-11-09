package com.yckj.javacore.day02.lesson;

/**
 * Copyright(c)2018 YCKJ.All rights Reserved
 *<br>
 * 人类型的测试使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181107
 *
 */
public class Demo01 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        //声明并调用类Person
        Person zhangsan = new Person();
        zhangsan.name = "张三";
        zhangsan.age = 18;
        zhangsan.sex = true;
        zhangsan.height = 176.5;
        zhangsan.weight = 60.8;

        /*
        调用zhangsan对象eat方法及read方法
         */
        zhangsan.eat();
        zhangsan.read();


        Person lisi = new Person();
        lisi.name = "李四";
        lisi.height = 180.1;
        lisi.weight = 70.3;
        System.out.println(lisi);
        System.out.println(zhangsan);
        lisi.read();
        lisi.sleep();
        lisi.eat();

        Student student  = new Student();
        student.stuId = 1;
        student.name = "王五";
        student.sex = true;

    }

}
