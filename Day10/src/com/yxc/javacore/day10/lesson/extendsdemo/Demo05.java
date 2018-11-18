package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * Object顶级父类的相关方法
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Demo05 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Phone phone = new Phone();
        Class clazz = phone.getClass();
        System.out.println(clazz.getName());

        System.out.println(phone);
        System.out.println(phone.toString());

        String str = "123";
        System.out.println(str);
        System.out.println(str.toString());

        Phone phone1 = new Phone();
        System.out.println(phone1.equals(phone));

        Phone phone2 = phone1;
        System.out.println(phone2.equals(phone1));

        System.out.println(1 == 1);
        System.out.println(phone == phone1);

        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("123");
        String str4 = new String("123");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
