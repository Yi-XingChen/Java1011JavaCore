package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 老师数据模型
 * 用来测试方法的重载
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Teacher {
    public int id;

    public String name;

    public String sex;

    public int age;

    public void speak() {
        System.out.println("说话方法");
    }

    /*public void eat() {
        System.out.println("我贼喜欢吃！");
    }*/

    //方法的重载与返回值无关
    public String eat() {
        System.out.println("我贼喜欢吃！");
        return "";
    }

    public void eat(String food) {
        //System.out.println("我贼喜欢吃！");
        this.eat();
        System.out.println("我正在吃:" + food);
    }

    public void eat(String food, String drink) {
        /*System.out.println("我贼喜欢吃！");
        System.out.println("我正在吃：" + food);*/
        this.eat(food);
        System.out.println("我正在喝：" + drink);
    }

    public void eat(String food, int foodNum) {
//        System.out.println("我贼喜欢吃！");
        this.eat();
        System.out.println("我正在吃：" + food + ",准备吃" + foodNum + "个");
    }

    //参数顺序
    public void eat(int foodNum, String food) {
        /*System.out.println("我贼喜欢吃！");
        System.out.println("我正在吃：" + food + ",准备吃" + foodNum + "个");*/
        this.eat(food,foodNum);
    }
    /*这种情况下是不行的，因为都是eat(String,String),
    如果是通过改变参数顺序来实现重载，则前提一定是参数列表中的数据类型不全都一样
    本质改动的是参数数据类型的顺序！！
     */
    /*public void eat(String drink, String food) {
        System.out.println("我贼喜欢吃！");
        System.out.println("我正在吃：" + food);
        System.out.println("我正在喝：" + drink);
    }*/
    /*public void eat(int foodNum, int food) {
        System.out.println("我贼喜欢吃！");
        System.out.println("我正在吃：" + food + ",准备吃" + foodNum + "个");
    }
    public void eat(int food, int foodNum) {
        System.out.println("我贼喜欢吃！");
        System.out.println("我正在吃：" + food + ",准备吃" + foodNum + "个");
    }*/

}
