package com.yxc.javacore.day13.lesson.enumdemo;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：通过普通类来实现季节枚举类的同样功能
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public class SeasonEnum {
    public static final SeasonEnum SPRING = new SeasonEnum(1,"SPRING","春季");

    public static final SeasonEnum SUMMER = new SeasonEnum(2,"SUMMER","夏季");

    public static final SeasonEnum FALL = new SeasonEnum(3,"FALL","秋季");

    public static final SeasonEnum WINTER = new SeasonEnum(4,"WINTER","冬季");

    public int flag;

    public String name;

    public String chinaName;

    private SeasonEnum() {

    }

    private SeasonEnum(int flag, String name, String chinaName) {
        System.out.println("自定义枚举类创建对象了");
        this.flag = flag;
        this.name = name;
        this.chinaName = chinaName;
    }

    public String name() {
        return this.name;
    }

    public int ordinal() {
        return this.flag;
    }

    public String chinaName() {
        return this.chinaName;
    }
}
