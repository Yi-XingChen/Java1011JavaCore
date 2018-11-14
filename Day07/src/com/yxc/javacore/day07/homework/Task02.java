package com.yxc.javacore.day07.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 编写代码实现输出一个3行4列且所有元素都为0的矩阵。
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Task02 {
    /**
     * 输出矩阵
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] ii1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int i = 0; i < ii1.length; i++) {
            for (int j = 0;j < ii1[i].length; j++) {
                System.out.print(ii1[i][j]);
            }
            System.out.println();
        }
    }

}
