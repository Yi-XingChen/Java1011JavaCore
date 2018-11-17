package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 方法重载的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Demo06 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //teacher.eat();

        //teacher.eat("汉堡");

        teacher.eat("汉堡",3);

    }
}
