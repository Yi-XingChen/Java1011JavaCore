package com.yxc.javacore.day04.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java自动类型提升
 *
 * @author 3342
 * @version 1.0
 * @date 20181109
 */
public class Demo06 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        byte b1 = 20;
        byte b2 = 12;
        //b1,b2自动提升为 int类型
        //int b3 = b1 + b2;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        int num1 = 100;
        float num2 = 100.00f;
        float num3 = num1 - num2;

        //运算结果并不能提升整个表达式结果的类型
        int num4 = 100000;
        int num5 = 100000;
        int num6 = num4 * num5;

        //float f1 = 1 - 0.9;
        float f1 = 1 - 0.9f;

        //查询运行结果
        System.out.println("除法运行结果如下：");
//        System.out.println(3 / 0);//除数不能为0
        System.out.println(3.0 / 0);//浮点数据类型除数可以为0。结果为Infinity ，无限
        System.out.println(10 / 3);//3
        System.out.println(2 / -3);//0
        System.out.println(-2 / 3);
        System.out.println(-3 / -2);//1
        System.out.println(10 / 0.0);
        System.out.println(-10 / 0.0);//-Infinity 负无限
        System.out.println(0 / 0.0);//NaN 无数据
        System.out.println(-0 / 0.0);

        System.out.println("求余运行结果如下：");
        //余数的符号与被除数的符号一样
//        System.out.println(3 % 0);//除数不能为0
        System.out.println(3.0 % 0);//NaN
        System.out.println(-3 % -2);//-1
        System.out.println(3 % 2);
        System.out.println(-3 % 2);
        System.out.println(3 % -2);//-1

        //是否存在一个整数x，使得x+1 < x?
        int x = 2147483647;
        int xx = x + 1;
        System.out.println(xx);
        int oo = xx - 1;
        System.out.println(oo);


    }
}
