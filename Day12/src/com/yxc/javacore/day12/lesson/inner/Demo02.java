package com.yxc.javacore.day12.lesson.inner;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：静态内部类的测试使用
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public class Demo02 {
    public static void main(String[] args) {
        OuterStaticDemo.className = "Java1011";
        OuterStaticDemo.staticInfo();
        OuterStaticDemo.InnerStaticDemo innerStaticDemo = new OuterStaticDemo.InnerStaticDemo();

        //直接访问静态内部类的静态成员变量
//        OuterStaticDemo.InnerClassName = "InnerJava1011";
        OuterStaticDemo.InnerStaticDemo.innerClassName = "InnerJava1011";

    }
}
