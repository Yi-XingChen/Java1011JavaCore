package com.yxc.javacore.day07.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 三维数组的使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Demo04 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] i1 = {11, 22, 33};
        int[] i2 = {1, 2, 3, 4};
        int[] i3 = {0, 1, 44, 33, 22};

        int[][] ii1 = new int[3][];
        ii1[0] = i1;
        ii1[1] = i2;
        ii1[2] = i3;

        int[][] ii2 = new int[3][];
        ii2[0] = i1;
        ii2[1] = i2;
        ii2[2] = i3;

        int[][] ii3 = new int[3][];
        ii3[0] = i1;
        ii3[1] = i2;
        ii3[2] = i3;

        int[][][] iii1 = new int[3][][];
        iii1[0] = ii1;
        iii1[1] = ii2;
        iii1[2] = ii3;

        System.out.println("iii1:" + iii1[2][2][3]);

        int[][][] iii2 = {
                {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}},
                {{12, 13}, {1, 2, 3, 4, 5}},
                {{1}, {1, 2, 3}, {1, 2, 4, 6, 6}},
                {{0}, {1}, {1, 3, 5, 7}}
        };

        for (int i = 0; i < iii2.length; i++) {
            for (int j = 0; j < iii2[i].length; j++) {
                for (int k = 0; k < iii2[i][j].length; k++) {
                    System.out.println(iii2[i][j][k]);
                }
            }
        }


        for (int[] ints : ii2) {
            for (int num : ints) {
                System.out.println(num);
            }
        }
    }
}
