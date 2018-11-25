package com.yxc.javacore.day13.lesson.enumdemo;

import java.util.Scanner;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：枚举类的使用测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //枚举类不能通过new关键字创建对象
        //Season season = new Season();
        /*Season spring = Season.SPRING;
        spring.chinaName = "春季";
        spring.info();

        Season fall = Season.FALL;
        fall.chinaName = "秋季";
        fall.info();
        System.out.println(fall.chinaName);*/

        Scanner scanner = new Scanner(System.in);
        String seasonStr = scanner.next();
        scanner.close();

        /*valueOf方法能够将字符串类型的数据转换成枚举类类型的对象，
        它在当前枚举类的枚举列表当中根据传入的字符串去查找对应的枚举对象，
        如果找到了，则返回该对象；如果找不到，则抛出异常。
         */
        Season season = Season.valueOf(seasonStr);

        switch (season) {
            case SPRING:
                System.out.println("春季");
                break;
            case SUMMER:
                System.out.println("夏季");
                break;
            case FALL:
                System.out.println("秋季");
                break;
            case WINTER:
                System.out.println("冬季");
                break;
            default:

        }

    }
}
