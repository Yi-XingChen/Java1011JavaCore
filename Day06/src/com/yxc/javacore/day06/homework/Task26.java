package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 小娟的妈妈每天给她3元钱，她都会存起来。
 * 但是，每当这一天是存钱天数的6倍或者钱的总额为6的倍数的话，她都会花去5元钱，
 * 请问，经过多少天，小娟才可以存到100元钱？
 *
 * @author 3342
 * @version 1.0
 * @date 20181113
 */
public class Task26 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int day;
        int money = 3;
        for (day = 1;money < 100;day++) {
            if (day % 6 == 0 || money % 6 == 0) {
                money -= 2;
            } else {
                money += 3;
            }
        }

        /*for (day = 1;money < 100;money += 3,day++) {
            if (day % 6 == 0 || money % 6 == 0) {
                money -= 2;
            }
        }*/
        System.out.println("所需天数为：" + day);
        /*
        这里有一个值得注意的点是：题目中所说的钱数是指达到那个值的天数，
        并没有考虑花掉之后不到那个值
         */
    }
}
