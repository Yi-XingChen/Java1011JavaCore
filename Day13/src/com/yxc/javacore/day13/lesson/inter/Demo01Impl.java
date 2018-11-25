package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：员工1 的实现方法
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public class Demo01Impl implements IDemo01 {

    @Override
    public void info() {
        System.out.println("输入一个值，比较该值的大小");
    }

    @Override
    public boolean compareNum(int num) {
        if(num > 100) {
            return false;
        } else {
            return true;
        }
    }
}
