package com.yxc.javacore.day06.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * for循环中break后接语句的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class ForDemo03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            //break;
//            System.out.println("1111");
            //for循环中的break后面也不能加代码

            /*if(i == 7){
                break;
//                System.out.println("111");
            }
            System.out.println("123");*/

            if(i==7)
                break;
            System.out.println("1111");
        }
    }
}
