package com.yxc.javacore.day09.lesson;

import com.yxc.javacore.day09.lesson.extendsdemo.Teacher;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 参数传递，值传递与引用传递的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Demo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        ParamDemo paramDemo = new ParamDemo();

        /*//值传递
        int toNum = 10;
        //int num = toNum;
        paramDemo.intChange(toNum);
        System.out.println("实参toNum调用方法之后的值：" + toNum);
        //形参值的改变并不会改变实参值的改变*/

        //引用传递测试
        Student toStudent = new Student(10);
        System.out.println("实参对象student的初始stuId值：" + toStudent.stuId);
        //Student student = toStudent;
        paramDemo.objectChange(toStudent);
        System.out.println("实参对象student调用方法之后的stuId值：" + toStudent.stuId);

        String toString = "123";
        paramDemo.stringChange(toString);
        System.out.println("实参：" + toString);

        Teacher teacher = new Teacher();
    }
}
