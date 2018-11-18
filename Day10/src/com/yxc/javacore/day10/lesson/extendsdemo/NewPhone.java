package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 方法的重写，定义一个新款手机数据模型
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class NewPhone extends Phone{

    public int sonId;

    public String sonName;

    @Override //注释重写的方法
    public void showNum() {
        System.out.println("来电显示功能！");
        System.out.println("显示来电者的姓名!");
        System.out.println("显示来电者的头像！");
    }

    /*
    该方法与父类方法同名，但参数列表不同，不能构成重写，
    却构成重载，这是父类同名方法与子类同名方法之间的重载
     */
    /*public void showNum(String num) {
        System.out.println("来电显示功能！");
        System.out.println("显示来电者的姓名!");
        System.out.println("显示来电者的头像！");
    }*/
}
