package com.yxc.javacore.day04.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java自增自减运算符的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181109
 */
public class Demo05 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 10;
        int y = x++;//先赋值后运算
        System.out.println("x:" + x);
        System.out.println("y:" + y);

        int x1 = 10;
        int y1 = ++x1;//先运算后赋值
        System.out.println("x1:" + x1);
        System.out.println("y1:" + y1);

        /*b = 5；
        c = 5+4-5+6=10
        d = 6+3-7+7=9*/
        int a = 4;
        int b = ++a;
        int c = b++ + --a - --b + ++b;
        int d = b++ + --a - b-- + ++b;
        System.out.println("a=" + a +",b=" + b + ",c=" + c + ",d=" + d);

    }
}
