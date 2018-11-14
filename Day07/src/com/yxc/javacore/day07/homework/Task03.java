package com.yxc.javacore.day07.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 要统计一个公司三个销售小组中每个小组的总销售额以及整个公司的销售额。
 * 如下所示
 * 第一小组销售额为{11, 12}万元
 * 第二小组销售额为{21, 22, 23}万元
 * 第三小组销售额为{31, 32, 33, 34}万元。
 *
 * 问题记录：总销售额sale不赋初值不能使用。
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Task03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] group1 = {11, 12};
        int[] group2 = {21, 22, 23};
        int[] group3 = {31, 32, 33, 34};
        int sale1 = 0,sale2 = 0,sale3 = 0;

        for (int i = 0; i < group1.length; i++) {
            sale1 += group1[i];
        }
        System.out.println("第一小组的总销售额为：" + sale1 + "元");

        for (int j = 0; j < group2.length; j++) {
            sale2 += group2[j];
        }
        System.out.println("第二小组的总销售额为：" + sale2 + "元");

        for (int k = 0; k < group3.length; k++) {
            sale3 += group3[k];
        }
        System.out.println("第三小组的总销售额为：" + sale3 + "元");

        System.out.println("总销售额为：" + (sale1+sale2+sale3) + "元");

    }
}
