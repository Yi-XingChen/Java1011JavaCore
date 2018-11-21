package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/21
 */
public class Demo06 {
    public static void main(String[] args) {
        first:{
            System.out.println("我是方法中的普通语句块");
        }

        Demo05 demo05 = new Demo05(11,"lisi");
        System.out.println(demo05.id + "----" + demo05.name + "----" + demo05.sex);
    }
}
