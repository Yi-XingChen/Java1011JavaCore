package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * for循环嵌套的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class ForDemo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i == 7) {
                break;
            }

            for (int j = 1; j <= 10; j++) {
                System.out.print(j);
                if (j == 6)
                    break;
            }
//            System.out.println(j);
            //j变量的作用域是内部的for循环结构，出了该结构j变量就不能使用了
        }

    }
}
