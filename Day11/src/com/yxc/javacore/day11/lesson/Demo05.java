package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：测试游离块的使用
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/21
 */
public class Demo05 {

    public int id;

    public String name;

    public String sex;

    /**
     *游离块的定义，游离块与普通语句块不同，它不能进行命名
     */
    /*first:{
        System.out.println("哈啊哈，我是游离块！");
    }*/
    {
        System.out.println("哈啊哈，我是游离块！");
        this.name = "无名氏";
        this.id = 1;
    }

    static {
        System.out.println("静态游离块");
    }

    {
        System.out.println("哈哈，我是另一个游离块！");
    }

    public Demo05(int id,String name) {
        System.out.println("Demo05的有参构造函数");
        this.id = id;
        this.name = name;
    }

    public Demo05() {
        System.out.println("Demo05的默认无参构造函数");
    }

    public void info() {
        System.out.println("展示信息方法！");
    }

    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        first:{
            System.out.println("我是方法中的普通语句块");
        }

//        Demo05 demo05;
        /*Demo05 demo05 = new Demo05();
        System.out.println(demo05.id + "----" + demo05.name);
        Demo05 demo051 = new Demo05();
        System.out.println(demo051.id + "----" + demo051.name);*/

        Demo05 demo05 = new Demo05(11,"lisi");
        System.out.println(demo05.id + "----" + demo05.name + "----" + demo05.sex);


    }
}
