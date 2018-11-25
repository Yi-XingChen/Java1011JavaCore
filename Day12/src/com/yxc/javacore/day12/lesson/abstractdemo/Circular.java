package com.yxc.javacore.day12.lesson.abstractdemo;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：抽象类的使用测试，圆形类
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public class Circular extends Tuxing {
    //在类中有abstract修饰符时，工具显示的图标不是圆
//public abstract class Circular {
    //public String type = "圆形";

    //public int id;

    /**
     * r代表圆的周长
     */
    //public double r;

    /**
     * 求圆形的周长方法
     *
     * @return 返回求得的周长
     */
    @Override
    public double getPerimeter() {
        System.out.println("求圆形的周长！");
        return 3.14 * 2 * d;
    }
}
