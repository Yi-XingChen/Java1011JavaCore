package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 *
 * switch语句的嵌套
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class SwitchDemo03 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        int num01 = 1;
        int num02 = 3;

        switch (num01) {
            case 1:
                System.out.println("外部switch的值：1");
                switch (num02) {
                    case 1:
                        System.out.println("内部switch的值：1");
                        break;
                    case 2:
                        System.out.println("内部switch的值：2");
                        break;
                    case 3:
                        System.out.println("内部switch的值：3");
                        break;
                    case 4:
                        System.out.println("内部的switch值：4");
                        break;
                }
                System.out.println("外部switch结束");
                break;
            case 2:
                System.out.println("外部switch的值：2");
                break;
            case 3:
                System.out.println("外部switch的值：3");
                break;
            case 4:
                System.out.println("外部的switch值：4");
                break;
        }
    }
}
