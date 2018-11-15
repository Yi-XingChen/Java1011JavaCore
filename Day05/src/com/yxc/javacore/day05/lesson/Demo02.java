package com.yxc.javacore.day05.lesson;

/**
 * Copyright(c)2018 YCKJ. All rights Reserved
 *
 * 逻辑运算符的使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181110
 */
public class Demo02 {
    /**
     * 主函数
     * 
     * @param args
     */
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = !b1;
        System.out.println(b2);

        boolean b3 = (22>23) & (25<23);
        System.out.println(b3);//false
        boolean b4 = true & false;//false
        b4 = true & true;//true

        boolean b5 = (23<22) | (25>27);
        System.out.println(b5);//false

        boolean b6 = (23>25) & (24<23);//false
        boolean b7 = (23>25) && (24<23);//false

        boolean b8 = true ^ true;
        System.out.println(b8);//false
        b8 = false ^ false;
        System.out.println(b8);//false
        b8 = false ^ true;
        System.out.println(b8);//true

        boolean b9 = true;
        b9 |= false;
        //b9 = b9 | false;
        System.out.println(b9);//true
        b9 &= false;
        //b9 = b9 & false;
        System.out.println(b9);//false

        boolean b10 = false;
        b10 ^= false; //false
        //b10 = b10 ^ false;
        b10 ^= true;//true

        int result = (99 + 100 > 123) ? 1 + 10 : 100 - 1;
        System.out.println(result);//11

        int a = 10;
        boolean b11 = (a++ < 9) && (a-- < 10);
        System.out.println(b11);//false
        System.out.println(a);//10

        int b = 10;
        int result1 = (b++ > 10) ? (b++ + b--) : (++b + b++);
        System.out.println(result1);//24
        System.out.println(b);//13

        /*int b = 10;
        int result1 = 0;
        if(b++ > 10){
            result1 = b++ + b--;
        }else{
            //b=11
            result1 = ++b + b++;
        }
        System.out.println(result1);
        System.out.println(b);*/
    }
}
