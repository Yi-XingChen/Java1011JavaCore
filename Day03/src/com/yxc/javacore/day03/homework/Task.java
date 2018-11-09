package com.yxc.javacore.day03.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Day03作业
 *
 * @author 3342
 * @version 1.0
 * @date 20181108 21:19
 */
public class Task {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 练习任务：
         * 任务一、定义三个变量，要求在控制台输出：
         * 输出Java课考试最高分：98.5
         * 输出最高分学员姓名：张三
         * 输出最高分学员性别：男
         **/
        float maxScore = 98.5f;
        String studentName = "张三";
        char studentsex = '男';
        System.out.println("Java课考试最高分：" + maxScore);
        System.out.println("最高分学员姓名：" + studentName);
        System.out.println("最高分学员性别：" + studentsex);

        /*
         * 任务二 、使用变量存储以下MP3信息，并打印输出：
         * 品牌（brand）：爱国者F928
         * 重量（weight）：12.4
         * 电池类型（type）：$内置锂电池
         * 价格（price）：499
         */
        String brand = "爱国者F928";
        float weight = 12.4f;
        String type = "$内置电池";
        short price = 499;
        System.out.println("品牌" + brand);
        System.out.println("重量" + weight);
        System.out.println("电池类型" + type);
        System.out.println("价格" + price);
    }

}
