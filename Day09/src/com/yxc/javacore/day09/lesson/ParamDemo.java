package com.yxc.javacore.day09.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 参数传递，值传递与引用传递的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class ParamDemo {
    /**
     * 值传递的测试
     *
     * @param num
     */
    public void intChange(int num) {
        System.out.println("num形参值初始数值：" + num);
        num++;
        System.out.println("num形参自增之后的数值：" + num);
    }

    /**
     * 引用传递参数测试
     *
     * @param student
     */
    public void objectChange(Student student) {
        System.out.println("形参student传入时的stuId：" + student.stuId);
        student.stuId = 100;
        System.out.println("形参student执行修改之后的stuId：" + student.stuId);
    }

    /**
     * String 特殊传递测试
     *
     * @param string
     */
    public void stringChange(String string) {
        System.out.println("形参：" + string);
        string = "100";
        System.out.println("实参：" + string);
    }
}
