package com.yckj.javacore.day02.lesson;

/**
 * Copyright(c)2018 YXC.All right Reserved
 * <br>
 *
 * @author 3342
 * @version 1.0
 * @date 20181107
 */
public class Demo03 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        /*
         *变量的第一种声明方式，声明的同时进行初始化
         */
        //Java的基础数据类型
        int num = 11;
        // Java的引用数据类型
        Person person = new Person();

        /*
         *变量的另一种声明方式，先声明后赋值
         */
        //声明一个int类型名为num01的变量
        int num01;
      //给已经声明的变量进行赋值
        num01 = 12;
        //num01变量是一个int类型的整型数据，而12.5明显是浮点型数据，不符合
//        num01 = 12.5;

        String string = "123";
//        string = 123;

//        num02 = 12;

    }
}
