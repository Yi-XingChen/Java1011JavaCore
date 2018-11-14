package com.yxc.javacore.day07.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 二维数组的使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //二维数组的第一维度大小必须确定，第二维度大小没有限制，可有可无
        //本质上就是由一维数组组成的
        int[][] ii1 = new int[4][];
        int[] i1 = {11, 12, 13};
        int[] i2 = {12, 10, 3, 2};
        int[] i3 = {13, 1, 13, 3, 23};
        int[] i4 = {14, 2, 13, 4, 5, 6};

        ii1[0] = i1;
        ii1[1] = i2;
        ii1[2] = i3;
        ii1[3] = i4;

        System.out.println(ii1[2][3]);
        System.out.println(ii1[1][1]);

        int[][] ii2 = {{1, 2, 3}, {2, 3, 33, 4}, {12, 34, 45, 56}};

        for (int i = 0; i < ii2.length; i++) {
            for (int j = 0; j < ii2[i].length; j++) {
                System.out.println(ii2[i][j]);
            }
        }

    }
}
