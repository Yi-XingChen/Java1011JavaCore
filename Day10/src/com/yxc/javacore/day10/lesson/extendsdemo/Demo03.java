package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 方法的重写
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.showNum();
        //newPhone.showNum("1233547567");
    }
}
