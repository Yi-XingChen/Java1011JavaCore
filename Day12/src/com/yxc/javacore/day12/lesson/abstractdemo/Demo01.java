package com.yxc.javacore.day12.lesson.abstractdemo;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：抽象类的使用测试
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
        //抽象类不能直接创建对象，抽象类是用来作为其他类的父类的，只能用于继承
        //Tuxing tuxing = new Tuxing();

        Square square = new Square();
        square.id = 1;
        square.type = "正方形";
        square.d = 10.0;
        double sp = square.getPerimeter();
        System.out.println(sp);

        Circular circular = new Circular();
        circular.id = 2;
        circular.type = "圆形";
        circular.d = 2.0;
        double cp = circular.getPerimeter();
        System.out.println(cp);

        Tuxing tuxing = new Square();
        tuxing.type = "正方形";
        tuxing.d = 10.0;
        double tp = tuxing.getPerimeter();
        System.out.println(tp);

        Tuxing tuxing1 = new Circular();
        tuxing1.type = "圆形";
        tuxing1.d = 2.0;
        double tp1 = tuxing1.getPerimeter();
        System.out.println(tp1);
        //可以特殊实例化就可以创建匿名对象

        /*
        对于抽象类的匿名内部类而言，必须去实现抽象类当中的抽象方法，否则编译报错
         */
       Tuxing tuxing2 = new Tuxing() {
           @Override
           public double getPerimeter() {
               System.out.println("等边三角形求周长");
               return 3 * d;
           }
       };
       tuxing2.type = "等边三角形";
       tuxing2.d = 3.0;
       double tp2 = tuxing2.getPerimeter();
        System.out.println(tp2);
        String type = tuxing2.getType();
        System.out.println(type);

    }
}
