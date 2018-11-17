package com.yxc.javacore.day08.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 创建一个可以求出1~100累加和的方法。
 *
 * @author 3342
 * @version 1.0
 * @date 20181116
 */
public class Task03Acc {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Acc acc = new Acc();
        int sum = acc.Acc();
        System.out.println("结果为：" + sum);
    }
}

class Acc {
    /**
     * 计算1~100的累加和
     * @return 返回累加和的结果
     */
    public int Acc() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
