package com.yxc.javacore.day06.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 打印1~100之间能被3整除的数,每行打印5个
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class WhileTask16 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 1;//保存要打印的数
        int count = 0;//统计打印的个数
        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.print(num + "\t");//不换行打印，\t为Tab的转义符
                count++;//统计, 每打印一个数就统计一次
                //判断是否进行换行
                if (count % 5 == 0) {
                    System.out.print("\n");
                }

            }
            num++;
        }
    }
}
