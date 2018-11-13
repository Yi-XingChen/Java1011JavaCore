package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * for循环结构的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class ForDemo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        /*for (int i = 1; i <= 10; i++)
            System.out.println(i);*/

        /*for (int i = 1; i <= 10; i++)
            int num = 11;*/
        //声明语句不能省略

//        int i = 1;
//        for (; ;){
//            if(i > 10) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

        /*for(;;) {
            System.out.println("good good study,day day up!");
        }*/
        //死循环

        /*for(System.out.println('a'); System.out.println('b'); System.out.println('c')){
            System.out.println('d');
        }*/
        /*编译都不能通过，因为中间判断的表达式要求的boolean类型的表达式，
        而这个是void类型的，为什么说它是void类型呢，因为定义println函数时就是用的void
         */

        ForDemo01 forDemo01 = new ForDemo01();

        /*boolean result1 = forDemo01.getResult();
        for(System.out.println('a'); result1; System.out.println('c')){
            System.out.println('d');
        }*/


        for(System.out.println('a'); forDemo01.getResult(); System.out.println('c')){
            System.out.println('d');
        }
        //这样的话，“测试”二字也会循环输出

    }

    public boolean getResult() {
        System.out.println("测试");
        return true;
    }
}
