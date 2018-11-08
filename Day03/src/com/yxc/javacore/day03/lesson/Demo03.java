package com.yxc.javacore.day03.lesson;

/**
 * Copyright(c)2018 YXC.All right Reserved
 * <br>
 * 变量使用的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181108
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //基础数据类型，也叫简单数据类型
        int num = 11;
        //引用数据类型，也叫复合数据类型
        Person person = new Person();

        //在Java当中，true、false、null是三个特殊的字面量值.  赋值号=右边的值就是字面量。
        /*boolean b1 = true;
        boolean b2 = false;
        Person person1 = null;

        double d1 = 12.22;

        char c1 = 'c';

        String strl = "123ldj";*/

        //布尔类型用于判断真和假
        boolean b1 = true;
        boolean b2 = false;
        //不能通过0或非0来代表真假，与C语言不同
//        boolean b3 = 0;

        //byte字节型
        byte by1 = 100;
        byte by2 = 0;
        byte by3 = -128;
//        byte by4 = -129;
//        byte by5 = 128;

        //short短整型
        short s1 = 0;
        short s2 = -32768;
        short s3 = 32767;
//        short s4 = -32769;
//        short s5 = 32768;

        //int整型
        int i1 = 12314;
        int i2 = -135346;

        //long 常整型
        /*
        为long类型变量赋值时，如果所赋值的字面量值为int表述的范围，
        则可以在该变量后面加L或l，也可以不加；
        如果所赋值的字面量值为超过int表述的范围时，则必须
        给该变量添加L或l
        */
        long l1 = 13454456;
        long l2 = -1655759787465463135L;

        //float,单精度浮点型，对于float类型的数据而言，必须要添加f或F
        float f1 = 12.12f;

        //不报错的原因在于小数的字面量为double类型，或者说浮点型的默认类型为double
        double d1 = 234.346;
        double d2 = 213.20;


        double d3 = 13.001f;
        System.out.println(d3);
        double d4 = 13.00;
        System.out.println(d4);


        //char
        char c1 = 'A';
        char c2 = 'a';
//        char c3 = 'aa';
        char c4 = '4';
        System.out.println(((int)c2));
        char c5 = 97;
        System.out.println(c5);
        char c6 = ' ';

        //回车
        char c7 = '\r';
        System.out.println("12" + c7 + "23");
        //换行
        char c8 = '\n';
        System.out.println("asd" + c8 + "34");
       //用Unicode编码
        char c9 = '\u0009';
        System.out.println("abc" + c9 + "12");

        //一个字符
        char c10 = 1234;
        System.out.println(c10);
        //汉字也是字符
        char c11 = '中';

        char c12 = '\'';
        System.out.println(c12);

    }
}
