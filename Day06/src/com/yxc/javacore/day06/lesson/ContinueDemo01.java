package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * continue测试案例
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class ContinueDemo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            if(i == 8 || i == 9){
                continue;
            }
            System.out.println(i);
        }*/

        /*for (int i = 1; i <= 10; i++) {
            if (i == 6 || i == 8) {
                continue;
            }
            for (int j = 1; j <= 10; j++) {
                if (j == 8 || j == 9) {
                    continue;
//                    System.out.println("111");
                }
                System.out.print("j:" + j);
            }
            System.out.println("  i:" + i);
        }*/

        first:for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 8 || j == 9) {
                    continue first;
                }
                System.out.println("j:" + j);
            }
            System.out.println("  i:" + i);
        }
    }
}
