package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 面向对象编程思想案例,把大象装进冰箱
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Demo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        DX dx = new DX();
        BX bx = new BX();

        //指挥冰箱打开门
        bx.openBX();
        //指挥大象进入冰箱
        dx.intoBX();
        //指挥冰箱关闭门
        bx.closeBX();
    }
}
