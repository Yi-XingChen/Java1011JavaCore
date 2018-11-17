package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 面向对象编程思想特性测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        /*Person person = new Person();
        person.id = 1;
        person.name = "张三";
        person.sex = "男";
        person.age  = 18;
//        person.schoolName = "太原理工大学";
        person.eat();
        person.speak();*/

        EduInfo eduInfo = new EduInfo();
//        eduInfo.schoolName = "太原理工大学";
        eduInfo.major = "计算机科学与技术";
        eduInfo.isGraduate = false;

        SchoolInfo schoolInfo = new SchoolInfo();
        schoolInfo.schoolId = 1;
        schoolInfo.schoolName = "太原理工大学";
        schoolInfo.address = "迎泽大街";
        schoolInfo.birthday = "1945";

        eduInfo.schoolInfo = schoolInfo;

        Person person = new Person();
        person.id = 1;
        person.name = "张三";
        person.sex = "男";
        person.age  = 18;
        person.eduInfo = eduInfo;

        System.out.println(person.eduInfo.schoolInfo.schoolName);
        //上面一行代码和下面四行代码的功能是一样的
        EduInfo eduInfoOut = person.eduInfo;
        SchoolInfo schoolInfoOut = eduInfoOut.schoolInfo;
        String schoolName = schoolInfoOut.schoolName;
        System.out.println(schoolName);

    }
}
