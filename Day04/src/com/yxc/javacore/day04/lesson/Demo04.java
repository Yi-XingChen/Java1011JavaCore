package com.yxc.javacore.day04.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * Java算术运算符的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181109
 */
public class Demo04 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int result = num1 + num2;
        System.out.println(result);

        String resultStr = "result的结果为：" + result;
        System.out.println(resultStr);
        String resultStr1 = num1 + num2 + "的结果";
        String resultStr2 = "结果为：" + num1 + num2;
        System.out.println(resultStr1);
        System.out.println(resultStr2);

        result = num1 / num2;
        System.out.println(result);

        float resulrFloat = num1 / num2;
        System.out.println(resulrFloat);

        result = num1 * num2;
        System.out.println(result);

        result = num1 % num2;
        System.out.println(result);

        double d1 = 123.2311;
        System.out.println(d1 % 3);

        int num3 = 20;
//        num3 = num3 - 2;
        num3 -= 2;
        System.out.println(num3);

        int num4 = 10;
        /*num4 = num4 + 1;
        num4 += 1;
        num4++;*/
        ++num4;
        System.out.println(num4);


    }
}
