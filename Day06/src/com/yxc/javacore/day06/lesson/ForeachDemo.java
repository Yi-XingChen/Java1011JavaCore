package com.yxc.javacore.day06.lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * for-each的测试
 *
 * @author 3342
 * @version 1.0
 * @date 20181111
 */
public class ForeachDemo {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
//        int[] arrs = new int[]{1, 2, 12, 23, 233, 45, 14};
//        for (int item : arrs) {
//            System.out.println(item);
//        }
        /*遍历数组
        *括号中的 int对应arrs的数据类型，item为变量名，随便取。
         */

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int num : list) {
            System.out.println(num);
        }
    }
}
