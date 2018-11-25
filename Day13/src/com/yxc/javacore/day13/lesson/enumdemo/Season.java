package com.yxc.javacore.day13.lesson.enumdemo;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：季节枚举类
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public enum Season {
    /**.
     * 枚举类中的首行代码必须定义当前枚举类的枚举列表。
     * 依次罗列当前枚举类能够创建的对象；使用标识符直接命名即可，
     * 每个对象之间用逗号分隔，用分号表示结束。
     */
    //public int id;
    SPRING(), SUMMER(1, "SUMMER", "夏季"), FALL(), WINTER();

    /**
     * 成员变量，记录当前季节的中文名称
     */
    public String chinaName;

    public int flag;

    public String name;

    /**
     * 枚举类的构造函数的权限访问修饰符必须是私有的，如果不显示编写权限访问权限，
     * 也是私有的，只不过是省略的而已，并不是包访问权限。
     */
    private Season() {
        System.out.println("季节枚举类对象创建了");
    }

    private Season(int flag, String name, String chinaName) {
        this.flag = flag;
        this.name = name;
        this.chinaName = chinaName;
    }

    /**
     * 成员方法，输出一个信息
     */
    public void info() {
        System.out.println("季节枚举类");
    }
}
