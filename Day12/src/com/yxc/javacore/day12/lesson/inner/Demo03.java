package com.yxc.javacore.day12.lesson.inner;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：匿名内部类的使用测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/22
 */
public class Demo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Father father = new Father(){
            public int sonId;

            public void sonInfo() {
                System.out.println("匿名成员方法");
            }

            /*@Override
            public void info(){
                this.sonId = 12;
                this.sonInfo();
                System.out.println("匿名内部类，重写了父类的info方法");
            }*/

        };

        father.info();
        father.id = 11;
        /*由于father变量采用的是Father的规范，只能调用父类Father当中的成员变量和成员方法，
        即便匿名子类当中定义了成员变量和成员方法，外部也不能直接调用
         */
        //father.sonId = 122;
        //father.sonInfo();
    }
}
