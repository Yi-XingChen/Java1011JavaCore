package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 我想买车，买什么车决定于我在银行有多少存款
 * 如果我的存款超过500万，我就买宾利
 * 否则，如果我的存款超过150万，我就买宝马
 * 否则， 如果我的存款超过100万，我就买奥迪
 * 否则， 如果我的存款超过10万，我就买QQ
 * 否则， 如果我的存款10万以下，那还买啥车
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class IfTask05 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您告诉我，我在银行有多少存款。");
        int money = scanner.nextInt();
        scanner.close();

        if(money >= 5000000) {
            System.out.println("我要买宾利");
        } else if (money >= 1500000) {
            System.out.println("我要买宝马");
        } else if (money >= 1000000) {
            System.out.println("我要买奥迪");
        } else if (money >= 100000) {
            System.out.println("我只能买QQ");
        } else {
            System.out.println("我什么车都买不了-_-");
        }
    }
}
