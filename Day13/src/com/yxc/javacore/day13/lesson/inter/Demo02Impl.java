package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：员工2的实现方法
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public class Demo02Impl implements IDemo01{
    @Override
    public void info() {
        System.out.println("输入一个int类型的数据，判断该数据与"
                + IDemo01.MAX_SIZE
                + "这个值大小的比较结果！如果该值比"
                + IDemo01.MAX_SIZE
                + "大，就返回false；"
                + "如果该值比"
                + IDemo01.MAX_SIZE
                + "小，就返回true。");
    }

    @Override
    public boolean compareNum(int num) {
        if(num > IDemo01.MAX_SIZE) {
            return false;
        } else if (num < IDemo01.MAX_SIZE) {
            return true;
        } else {
            System.out.println("当前值等于" + IDemo01.MAX_SIZE + ",默认返回true");
            return true;
        }
    }
}
