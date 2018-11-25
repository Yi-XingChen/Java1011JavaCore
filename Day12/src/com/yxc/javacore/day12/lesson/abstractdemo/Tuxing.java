package com.yxc.javacore.day12.lesson.abstractdemo;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：抽象类的使用测试，图形类
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * 要点：抽象方法只能定义在抽象类中，如果说一个类存在抽象方法，那么该类一定是抽象类；
 * 如果一个类是抽象类，但它当中完全可以不定义一个抽象方法。
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public abstract class Tuxing {
    public int id;

    public String type;

    /**
     * 每种图形计算周长的长度值
     */
    public double d;

    public static int num;

    //父类一定存在构造函数，原因是父类的属性需要初始化，以便让子类对象使用。

    public Tuxing() {

    }

    public String getType() {
        return this.type;
    }

    public abstract double getPerimeter();
    //final、static、private这三个修饰符不能修饰抽象方法，因为它们冲突
//    private abstract double getPerimeter();
//    public final abstract double getPerimeter();
//    public static abstract double getPerimeter();

}
