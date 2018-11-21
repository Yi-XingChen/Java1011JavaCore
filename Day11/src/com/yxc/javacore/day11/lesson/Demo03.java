package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：static静态关键字使用的测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/21
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public final static void main(String[] args) {

        //this.id = 111;

        /*System.out.println(Person.schoolName);
        System.out.println(new Person().schoolName);
        System.out.println(Person.class);

        Person person = new Person();

        new Person().schoolName = "太原科技大学";

        System.out.println(new Person().schoolName);
        System.out.println(person.schoolName);

        Person.info();*/

       /* Person person = new Person();
        person.id = 1;
        person.name = "张三";
        person.schoolName = "太原科技大学";

        Person.schoolName = "太原工业大学";
        //Person.id = 3;

        System.out.println(person.schoolName);

        //person.schoolName = "中北大学";

        Person person1 = new Person();
        person.id = 2;
        person.name = "李四";
        System.out.println(person1.schoolName);

        Person person2 = new Person();
        System.out.println(person2.schoolName);

        System.out.println(Person.schoolName);*/

        {
            System.out.println("jajaja,测试语句块");
            int num = 11;
        }
        {
            //语句块中的局部变量也存在作用范围
//            num = 12;
        }


    }

}
