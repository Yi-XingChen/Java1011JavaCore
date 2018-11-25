package com.yxc.javacore.day12.lesson.inner;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：内部类的使用测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        匿名对象
         */
        new OuterDemo().eat();


        OuterDemo outerDemo = new OuterDemo();
        outerDemo.id = 1;
        outerDemo.age =18;
        outerDemo.eat();

        OuterDemo.InnerDemo innerDemo = outerDemo.new InnerDemo();
        innerDemo.innerAge = 19;
        innerDemo.innerId = 2;
        innerDemo.innerInfo();

        OuterDemo.InnerDemo innerDemo2 = outerDemo.new InnerDemo();

        OuterDemo.InnerDemo innerDemo1 = new OuterDemo().new InnerDemo();

        //这种声明内部类对象类型的方式是错误的
        //InnerDemo innerDemo3 = outerDemo.new InnerDemo();
        /*不能直接访问内部类的构造函数，必须通过一个外部类对象访问内部类构造函数，
        因为每一个内部类对象都要归属于一个外部类对象
         */
        //OuterDemo.InnerDemo innerDemo4 = new InnerDemo();

    }
}
