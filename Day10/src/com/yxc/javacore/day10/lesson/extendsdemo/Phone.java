package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 方法的重写，定义一个手机数据模型
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Phone {

    public int id;

    public String name;

    public void sendMessage() {
        System.out.println("发送短信功能！");
    }

    public void call() {
        System.out.println("打电话功能！");
    }

    public void showNum() {
        System.out.println("来电显示功能！");
    }

    /*@Override
    public String toString() {
        return "id=" + this.id + ",name=" + this.name;
    }*/

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
