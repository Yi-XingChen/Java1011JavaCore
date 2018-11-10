package com.yxc.javacore.day04.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java中的强制类型转换测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181109
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        char c1 = 10;
        byte b1 = (byte) c1;
        System.out.println(b1);

        char c2 = 'a';
        byte b2 = (byte) c2;
        System.out.println(b2);

        float f1 = (float) 12.32;
        System.out.println(f1);

        char c3 = 1000;
        byte b3 = (byte) c3;
        System.out.println(b3);
        /*
        在使用强制类型转换时，会出现数据的异常以及精度缺失
        强制类型转换存在使用的风险，需要人为地去判断数据转换是否会出现异常
         */
        float f2 = 12.82f;
        int i1 = (int) f2;
        System.out.println(i1);

        byte b4 = 123;
        char c4 = (char) b4;
        System.out.println(c4);

        String str = new String();
        str = "111";
        System.out.println(str);

        String str1 = new String("123");
        System.out.println(str1);

        Student student = new Student();
        System.out.println(student);

        String str2 = "123";
        System.out.println(str2);
    }
}
