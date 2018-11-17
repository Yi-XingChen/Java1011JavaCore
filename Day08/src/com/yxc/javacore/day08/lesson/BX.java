package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 面向对象编程思想案例，冰箱数据模型
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class BX {
    /**
     * 冰箱门是否打开，true代表打开，false代表关闭
     */
    public boolean isOpen;

    /**
     * 打开冰箱的方法
     */
    public void openBX() {
        //当前冰箱门为关闭状态
        if (isOpen == false) {
            isOpen = true;
        }
        System.out.println("冰箱门已经被打开！");
    }

    /**
     * 关闭冰箱的方法
     */
    public void closeBX() {
        //当冰箱门为开着的时候，进行关闭
        if (isOpen == true) {
            isOpen = false;
        }
        System.out.println("冰箱门已经被关闭！");
    }
}
