package com.yckj.javacore.day02.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 *
 * @author 3342
 * @version 1.0
 * @data 20181107
 */
public class Demo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num01 = 11;
        /*
        Java当中的标识符是由字母、数字、下划线、美元符号以及语言文字组成，并且不能以数字开头
         */
        int num02_aa$aa易星辰 = 22;
//        int 11num = 33;
        int _aa01 = 44;
        int ￥_￥ = 55;
        //这里的￥相当于一个中文字符了
        int 卍 = 5;
        int ____ = 66;
        int 哈哈哈 = 77;
        //除了_和$，其他特殊字符不能作为标识符的元素
//        int m#n = 88;
//        int Hello World = 88;

        //关键字和保留字不能作为标识符的元素
//        int class = 00;
        int Class = 11;

        //特殊的字面量值true、false、null不能作为标识符
//        int true = 222;
        int True = 233;

        //Java对于大小写敏感，大小写不同的字母代表不同的标识符
        int a = 1;
        int A = 2;

        int String = 33;

    }
}
