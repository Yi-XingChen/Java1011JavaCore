package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java方法形参（入参）的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Student {
    public int id;

    public String name;

    public String sex;

    public int age;

    /**
     * 展示信息的方法，没有形参
     */
    public void info() {
        System.out.println("学生类型的展示信息方法！");
//        System.out.println("正在吃：" + foot);

        //方法不能嵌套定义
        /*void info01() {

        }*/
    }

    /**
     * 吃东西方法
     *
     * @param food (局部变量) 吃什么东西
     */
    /**
     * 吃东西方法
     *
     * @param food    吃什么东西
     * @param foodNum 吃了几个
     */
    public void eat(String food, int foodNum, String drink, int drinkNum) {
        System.out.println("吃东西的方法！");
        System.out.println("正在吃：" + food + "，准备吃" + foodNum + "个");
        System.out.println("正在喝：" + drink + "，准备喝" + drinkNum + "瓶");
    }

    /*public byte study() {
        System.out.println("学生的学习方法");
//        return "学习得很开心！";
//        return (String)1213;//引用与基础数据类型不能强转
        return (byte)129;
    }*/

    /**
     * 学习方法，带有不是void的返回值
     *
     * @return 返回当前的学习状态
     */
    public String study() {
        System.out.println("学生的学习方法");
        return "学习得很开心！";
    }

    /**
     * 说话方法，说不确定的几句话
     *
     * @param strings 不确定条数的话
     */
//    public void speak(String flag, String flag01,String... strings,String num) {//可变形参只能放在参数列表的最后一位
//    public void speak(String flag, String flag01,String... strings,String... strings) {/可变形参只能有一个
    public void speak(String flag, String flag01, String... strings) {
        //System.out.println(strings[0]); //这样用的话，如果为空就报空指针异常了
        System.out.println("flag变量打印的内容：" + flag);
        System.out.println("flag01变量打印的内容：" + flag01);
        System.out.println("要开始说话了：");
        for (String string : strings) {
            System.out.println(string);
        }
        //for-each循环冒号 : 后面只能是集合


    }
}
