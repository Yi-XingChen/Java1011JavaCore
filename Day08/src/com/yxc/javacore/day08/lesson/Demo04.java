package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java方法形参（入参）的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Demo04 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        //调用无参的成员方法
//        student.info();

//        student.eat("汉堡",3,"可乐",3);
        //student.eat(123);

        /*String status = student.study();
        System.out.println(status);*/

        //返回void的方法不能赋给任何的变量
//        String str = student.info();

        //形参个数可变测试
       // student.speak();
        //student.speak("说的第一句话");
       // student.speak("说的第一句话","说的第二句话","说的第三句话");

        /*String[] strings = {"说的第一句话","说的第二句话","说的第三句话"};
        String[] strings1 = {"说的第一句话"};
        String[] strings2 = {};
        student.speak(strings1);*/

        student.speak("flag","说的第一句话","说的第二句话","说的第三句话");
    }
}
