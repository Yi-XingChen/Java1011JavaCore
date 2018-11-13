package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 用if...else if...else语句实现学生考试成绩评价业务：
 * 从控制台输入学生成绩，成绩在90分(包括90分)以上，输出“优秀”，
 * 80分以上(包括80分）输出“良好”，
 * 70分以上(含)，输出“中等”，
 * 60分以上(包括60分),输出“及格”，
 * 否则，输出“不及格”。
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class IfTask04 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入学生成绩：");
        int score = scanner.nextInt();
        scanner.close();

        if (score < 0 || score > 100) {
            System.out.println("您输入的成绩不合理，请您重新输入。");
            return;
        } else if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 70) {
            System.out.println("中等");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
