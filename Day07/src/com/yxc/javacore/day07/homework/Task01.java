package com.yxc.javacore.day07.homework;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 有一个一维数组 int[] arr = {90,34,67,78,97,67,45}，
 * 找出数组中最大值、最小值元素。
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Task01 {
    /**
     * 找最值
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {90,34,67,78,97,67,45};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
    }
}
