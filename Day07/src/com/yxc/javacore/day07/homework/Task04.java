package com.yxc.javacore.day07.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 将一个二维数组的数据存到一维数组中，并且遍历输出。
 *
 *问题：如果二维数组的维度都不确定，应该如何处理？
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Task04 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] ii1 = {{1,2,3},{4,5,6},{7,8,9},{0,2,3}};
        int[] i1 = new int[12];
        for (int i = 0; i < ii1.length; i++) {
            for (int j = 0; j < ii1[i].length; j++) {
//                System.out.print(ii1[i][j]);
                i1[i*ii1[i].length+j] = ii1[i][j];
            }
        }
        System.out.print('\n' + "一维数组：");
        for (int m = 0; m < i1.length; m++) {
            System.out.print(i1[m]);
        }

    }
}
