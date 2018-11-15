package com.yxc.javacore.day05.lesson;

/**
 * Copyright(c)2018 YCKJ. All rights Reserved
 * <p>
 * 位运算符的使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181110
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        byte b1 = 3;
        int b2 = ~b1; //自动类型提升
        System.out.println(b2);//-4

        /*
        需要注意的是：& 与 | 在boolean类型时是与、或；
        而在整型时为：按位与、按位或；
        当然无论在何种类型下，他们的真值表是相通的。
         */
        byte b3 = 42 & 15;
        System.out.println(b3);//10

        byte c = 42 | 15;
        System.out.println(c);//47

        byte d = 42 | -15;
        System.out.println(d);//-5

        byte b4 = 42 ^ 15;
        System.out.println(b4);//37

        boolean bn = true ^ false;//true
        System.out.println("异或" + bn);

        //互换两个变量的值，引用第三变量
        int num1 = 10;
        int num2 = 11;
        int num3 = 0;
        num3 = num1;
        num1 = num2;
        num2 = num3;

        //互换两个变量的值，不引用第三变量
        System.out.println("用异或互换两个变量的值：");
        int a = 10;
        int b = 20;
        a = a ^ b;   //a == 30
        System.out.println(a);
        b = a ^ b;  //b == 10
        System.out.println(b);
        a = a ^ b; //a == 20
        System.out.println(a);

        System.out.println("用加减法互换两个变量的值：");
        int aa = -10;
        int bb = 20;
        aa = aa + bb;   //aa == 10
        System.out.println(aa);
        bb = aa - bb;  //bb == -10
        System.out.println(bb);
        aa = aa - bb; //aa == 20
        System.out.println(aa);

        int num01 = 8 << 2;
        System.out.println("左移" + num01);

        int num02 = 8 >> 2;
        System.out.println("右移" + num02);

        int num03 = -15 >> 1;
        System.out.println(num03);

        int num04 = -15 >>> 1;
        System.out.println(num04);

        /*
         *如果是正整数，>> 和 >>> 没什么区别，但是负整数就大不一样了
         */
        int num06 = 15 >> 1;
        System.out.println(num06);

        int num07 = 15 >>> 1;
        System.out.println(num07);


        int num05 = (int) (12 * 12.3);
    }
}
