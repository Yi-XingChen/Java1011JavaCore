package com.yxc.javacore.day08.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 创建一个方法键盘录入两个数据，比较两个数是否相等。
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Task05IsQuery {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        IsQuery isquery = new IsQuery();
        boolean b1 = isquery.Isquery(a,b);
        if(b1 == true) {
            System.out.println("两个数相等");
        } else {
            System.out.println("两个数不相等");
        }
    }
}

class IsQuery {
    /**
     * 判断两个数是否相等
     * @param a 参数1
     * @param b 参数2
     * @return 返回是否相等
     */
    public boolean Isquery(int a,int b) {
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
}
