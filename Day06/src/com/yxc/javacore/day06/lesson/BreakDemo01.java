package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * break语句的goto功能
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class BreakDemo01 {
    public static void main(String[] args) {
        boolean b1 = true;

        first:{
            second:{
                third:{
                    if(b1) {
                        System.out.println("third1");
                        //break fouth;
                        /*break 其goto作用时，只能跳转当前break所在的语句块结构，
                        不能跳转break不被包含的其他语句结构*/
                        break third;
                    }
                    System.out.println("third2");
                }
                System.out.println("second");
            }
            System.out.println("first");
        }
        fouth:
        {
            System.out.println("fouth");
        }
    }
}
