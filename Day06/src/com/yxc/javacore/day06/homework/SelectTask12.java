package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 输入星期一到日的英文首字母，输出对应星期几。
 * 如果第一个字符不能判断出星期几，提示用户输入第二个英文字符。
 * 使用switch嵌套。
 *
 * @author 3342
 * @version 1.0
 * @date 20181112
 */
public class SelectTask12 {
    /**
     * 输入一两个字母，输出对应的星期几
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英文首字母：");
        String firstChar = scanner.next();

        switch (firstChar) {
            case "M":
                System.out.println("星期一");
                break;
            case "W":
                System.out.println("星期三");
                break;
            case "F":
                System.out.println("星期五");
                break;
            case "T":
                System.out.println("请再输入一个字符");
                String secondChar = scanner.next();
                switch (secondChar) {
                    case "U":
                        System.out.println("星期二");
                        return;
                    case "H":
                        System.out.println("星期四");
                        return;
                    default:
                        System.out.println("输入的字符不合理，请重新输入");
                        return;
                }
            case "S":
                System.out.println("请再输入一个字符");
                String secondChar1 = scanner.next();
                switch (secondChar1) {
                    case "A":
                        System.out.println("星期六");
                        break;
                    case "U":
                        System.out.println("星期日");
                        break;
                    default:
                        System.out.println("输入的字符不合理，请重新输入");
                        return;
                }
            default:
                System.out.println("输入的字符不合理，请重新输入");
                break;
        }
        scanner.close();
    }
}
