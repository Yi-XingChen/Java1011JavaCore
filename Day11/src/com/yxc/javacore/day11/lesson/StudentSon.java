package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * final测试
 *
 * @author 3342
 * @version 1.0
 * @date 2018118
 */
//public class StudentSon{
    //final修饰Student类型之后，就不可以被继承了
public class StudentSon extends Student{
    public void eat() {
        System.out.println("这个学生贼能吃！");
    }

    //final修饰的成员方法不能被重写
    /*public void study() {
        System.out.println("学习方法");
    }*/
}
