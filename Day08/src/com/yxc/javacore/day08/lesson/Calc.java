package com.yxc.javacore.day08.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 数据计算模型，用于完成某些数学计算
 *
 * @author 3342
 * @version 1.0
 * @date 20181115
 */
public class Calc {
    /**
     * 输入一个正整数，将其倒叙输出，返回给调用者
     * @param num 正整数
     * @return 倒叙之后的字符串
     */
    public String daoxuTest(int num) {
        //用来记录倒叙产生的字符串，初始值为一个空字符串
        String daoxuString = "";

        /*
         * 1.通过对传入的正整数进行对10 求模，获得每一个低位的值
         * 2.将其与字符串拼接，转换成字符串后赋值给记录的字符串daoxuString
         * 3.对传入的正整数缩小倍数，使用除10，再将其赋值给初始变量num
         * 4.知道num值变成0，代表取值到了最高位
         */
        while (num > 0) {
            int mod = num % 10;
            daoxuString = daoxuString + mod;
            num = num / 10;
        }

        return daoxuString;
    }
}
