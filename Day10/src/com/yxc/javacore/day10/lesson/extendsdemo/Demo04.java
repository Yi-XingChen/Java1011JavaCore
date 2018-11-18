package com.yxc.javacore.day10.lesson.extendsdemo;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 *
 * 继承中的特殊对象实例化
 *
 * @author 3342
 * @version 1.0
 * @date 20181117
 */
public class Demo04 {

    /*
    多态，根据入参不同来决定调用不同的成员方法和成员变量
     */
    public void test(Phone phone) {
        //phone.call();
        if(phone instanceof NewPhone) {
            System.out.println("这是一个本质上为子类NewPhone类型的对象");
        }

        /*if(phone instanceof Phone) {
            System.out.println("这是一个Phone类型及其子类类型的对象");
        }*/

        phone.showNum();
    }

    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.toString();
        phone.getClass();

        NewPhone newPhone = new NewPhone();
        newPhone.toString();
        newPhone.getClass();

        /*
        继承当中所谓的特殊对象实例化是指：子类对象赋值给声明的父类类型变量
        由于子类继承于父类，子类构造函数默认会调用父类构造函数，
        子类具备父类当中所有的对外访问的成员变量和成员方法，所以，
        子类对象能够提供父类类型的所有要求的成员变量和成员方法，
        进而能够将子类对象赋值给父类类型变量。
         */
        Phone phone1 = new NewPhone();
        /*
        phone1变量本质上创建的对象是NewPhone类型的对象，
        但是采用的数据类型却是Phone类型的，在使用该变量时，
        会采用声明时的数据类型规范，所以，
        只能调用父类当中定义有的成员变量和成员方法
         */
        phone1.id = 123;
//        phone1.sonId = 123;
        //((NewPhone) phone1).sonId = 123;
        phone1.name = "123";
//        phone1.sonName = "123";
        //phone1.call();

        /*调用的是子类的，因为创建的对象是NewPhone类型的，
        所以使用该变量时，采用的是声明的数据类型规范，
        如果父类中没有定义showNum方法，则会报错。
         */
        //phone1.showNum();

//        Person person = new Phone();
        /*
        父类对象是不能赋值给子类类型的，原因是父类对象虽然具备一些子类类型所要求的成员变量和成员方法，
        但是子类扩展出来的新的成员变量和成员方法，父类对象不具备，
        因此，不能将父类对象赋值给子类类型。
         */
//        NewPhone newPhone1 = new Phone();
       // NewPhone newPhone1 = (NewPhone) new Phone();

        Demo04 demo04 = new Demo04();
        Phone phone2 = new Phone();
        NewPhone newPhone1 = new NewPhone();
        demo04.test(phone2); //父类
        demo04.test(newPhone1);
    }
}
