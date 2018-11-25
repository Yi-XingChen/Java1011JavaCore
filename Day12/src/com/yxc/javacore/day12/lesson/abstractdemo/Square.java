package com.yxc.javacore.day12.lesson.abstractdemo;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：抽象类的使用测试,正方形类
 *
 * 要点：正方形类继承于抽象类图形类，要求子类正方形类要么实行父类当中的抽象方法；
 * 要么将子类正方形类也变成一个抽象类（原因：子类继承抽象类父类之后，将父类当中的
 * 抽象方法也继承下来了，存在抽象方法的类一定是抽象类，所以，子类必须为抽象类）。
 *
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public class Square extends Tuxing {
//public abstract class Square extends Tuxing {
    //public String type = "正方形";

    //public int id;

    /**
     * d代表正方形的边长
     */
//    public double d;

    /**
     * 求周长的方法
     */
    @Override
    public double getPerimeter() {
        System.out.println("求正方形的周长！");
        return 4 * d;
    }


}
