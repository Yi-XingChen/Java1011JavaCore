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
public class Demo02 {
    /**
     * 使用final修饰成员变量时，该全局变量变成了全局常量
     * 要求该变量必须明确赋初始值
     */
//    final public int id;
    final public int id = 22;

    /**
     * 1.访问权限修饰符public要在final修饰符之前声明
     * 2.对于全局常量而言，常量的名称必须要全部大写定义
     * 这些都是规范
     */
    public final int ID = 12;

    public final int NUM_SIZE = 100;


    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        final int num = 12;
        /*
         *Java当中通过final关键字来表示常量
         * 常量一旦赋值之后，就再也不能对值进行修改
         */
//        num = 23;
        //添加final后的变量就变常量了
        System.out.println(num);

        final int num02;
        //第一次赋值
        num02 = 13;
//        num02 = 22;

        Demo02 demo02 = new Demo02();
        //常量的值不能进行修改
//        demo02.ID  = 150;

    }
}
