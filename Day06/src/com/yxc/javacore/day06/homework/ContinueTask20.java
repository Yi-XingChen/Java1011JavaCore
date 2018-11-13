package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 将0到9中的偶数和奇数分两列打印
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class ContinueTask20 {
    /**
     *主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if(i%2 == 0) continue;
            System.out.println();
        }
    }
}
