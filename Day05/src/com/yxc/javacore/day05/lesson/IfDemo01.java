package com.yxc.javacore.day05.lesson;

/**
 * Copyright(c)2018 YCKJ. All rights Reserved
 *
 * if语句结构
 *
 * @author 3342
 * @version 1.0
 * @date 20181110
 */
public class IfDemo01 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        /*if(false){
            System.out.println("哈哈哈");
        }
        System.out.println("呵呵呵");*/
        /*Scanner scanner = new Scanner(System.in);
        boolean b1 = scanner.nextBoolean();
        if(b1){
            System.out.println("条件为true时执行的内容");
        }else{
            System.out.println("条件为false时执行的内容");
        }*/

        if(3 > 2){
            System.out.println("当前if条件成立时，执行");
        }else if(4 < 3){

        }else if(5 > 3){

        }else if(6 > 7){

        }else{

        }

        if(10 > 7){
            if(9 < 11){

            }else if(8>1){

            }else if(9<10){

            }else{

            }
        }else {
            if(11 > 12){

            }
        }
    }
}
