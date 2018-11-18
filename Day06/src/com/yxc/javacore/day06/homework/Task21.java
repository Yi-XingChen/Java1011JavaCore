package com.yxc.javacore.day06.homework;

import java.util.Scanner;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 猜数游戏：生成一个[0，100）之间的随机整数，提示用户输入猜测的数字，
 * 如果不相等提示用户大了还是小了，输出用户共猜测了多少次。
 * 生成一个[0，100）之间的随机整数使用int dest = (int)(Math.random()*100);
 * dest即为生成的随机数。
 *
 * @author 3342
 * @version 1.0
 * @date 20181113
 */
public class Task21 {
    /**
     * 猜数游戏
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dest = (int) (Math.random() * 100);
        System.out.println("请您输入一个数字：");

        /*int num = scanner.nextInt();
        int i = 1;
        for (i = 1; dest != num; i++) {
            if (num > dest) {
                System.out.println("您猜大了，请再猜一次");
                num = scanner.nextInt();
            } else {
                System.out.println("您猜小了，请再猜一次");
                num = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println("恭喜您，猜对了");
        System.out.println("您一共猜了" + i + "次");
        *//*这里是i还是（i+1）就需要对for循环的执行过程有一个清楚的理解
        重新输入一个数后，是先i++ 然后才进行判断输入的数与生成的数是否一致
         */



        //方法二：使用do-while
        int guessNum = -1;
        int guessCount = 0;

        do {
            guessNum = scanner.nextInt();
            guessCount++;
            if (guessNum > dest) {
                System.out.println("您猜的数值大了");
            } else if (guessNum < dest) {
                System.out.println("您猜的数值小了");
            } else {
                System.out.println("恭喜您，猜对了！您一共猜了" + guessCount + "次");
            }
        } while (dest != guessNum);
    }
}
