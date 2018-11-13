package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * do-while循环结构的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class DoWhileDemo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //计算1到100的值
        int num = 1;
        int sum = 0;
        do {
            sum += num;
//            sum = sum + num;
            num++;
        }while (num <= 100);
        System.out.println(sum);

        //一行代码
        num++;

//        num > 10;
        //一个表达式
    }
}
