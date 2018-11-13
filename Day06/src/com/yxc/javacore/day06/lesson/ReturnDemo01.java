package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * return测试案例
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class ReturnDemo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 8 || i == 9) {
                return;
            }
        }
        System.out.println("循环结束");*/

        int x = 2;
        //分析运行结果：
        while (x <= 10) {
            x++;
            System.out.println(x);
            if (x == 4) {
                continue; // 跳出本次循环，会略过continue语句块后面的循环体语句不再执行，继续去判断后面的循环条件
            }
            x++;
            System.out.println("x=" + x);
        }

        System.out.println("主函数main方法开始执行");
        ReturnDemo01 returnDemo01 = new ReturnDemo01();
        returnDemo01.test();
        System.out.println("主函数main方法执行结束！");
    }

    public void test() {
        System.out.println("成员方法test开始执行");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 3) {
                //break;
                return;
//                System.out.println("123");
                //return后面同样不能加语句
            }
        }
        System.out.println("成员方法test执行结束");
    }

    public void test01() {
        System.out.println("111");
        return;//在返回类型为void的函数中可以省略
    }

    public int test02() {
        System.out.println("13443");
        return 001;
    }
}
