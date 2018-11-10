package com.yxc.javacore.day04.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java当中的自动类型转换测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181109
 */
public class Demo02 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        //涉及到了Java当中的自动类型转换规则
        char c1 = 'A';
        char c2 = c1;

        int i1 = c1;
//        byte b1 = c1;
//        short s1 = c1;

        byte b2 = 123;
//        char c3 = b2;

        int i2 = 1232;
        long l1 = i2;

        float f1 = i2;

        long l2 = 111111L;
        float f2 = l2;

//        float f3 = 12.23;
        //不行的原因为：double类型无法自动转换为float
        float f4 = 12.23f;

        char c3 = 123;
        short s2 = 123;
        //计算时为int类型，存储时为才是char类型

        char c5 = 10;
//        byte b5 = c5;

    }
}
