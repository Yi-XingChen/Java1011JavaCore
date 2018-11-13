package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * <p>
 * while循环结构的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class WhileDemo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 0;
        /*while (num < 10) {
            System.out.println("num:" + num);
            num++;
        }*/

        while (num < 11)
            num++;
        //循环体只有一个语句，花括号省略

        /*while (num < 10)
            int num01 = 12;*/
        //报错

        while (++num < 10) {//避免死循环
            int num01 = 12;
        }

        while(++num < 10);
        //无循环体，没意义，只是说可以这么做



    }
}
