package com.yxc.javacore.day13.lesson.enumdemo;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：枚举类顶级父类Enum类当中的一些有用方法
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public class Demo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //Season spring = Season.SPRING;
        /*
        Enum枚举类父类重写了顶级父类Object当中的toString方法
         */
        /*System.out.println(spring);
        System.out.println(spring.toString());

        System.out.println(spring.name());

        System.out.println(spring.ordinal());

        System.out.println(Season.FALL.ordinal());

        System.out.println(Season.FALL.compareTo(spring));*/

        Season summer = Season.SUMMER;
        System.out.println(summer.flag + "-----" + summer.chinaName);

        //SeasonEnum seasonEnum = new SeasonEnum();

        //由此得知，SeasonEnum类中的声明需要final关键字
        /*SeasonEnum springEnum = SeasonEnum.SPRING;
        SeasonEnum SUMMER = springEnum;
        //springEnum = SeasonEnum.SUMMER;
        System.out.println(SeasonEnum.SUMMER.chinaName);*/

        SeasonEnum summerEnum = SeasonEnum.SUMMER;
        System.out.println(SeasonEnum.SUMMER.chinaName);

    }
}
