package com.yxc.javacore.day07.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 一维数组的遍历
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Demo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {12, 14, 21, 54, 23, 16};
        //System.out.println("长度为：" + nums.length);

        /*int[] nums1 = null;
        System.out.println(nums1.length);*/

        /*//第一种
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            nums[i] = 10;
        }
*/
        //第二种遍历方式
        /*for-each执行效率比普通for循环高，迭代
        但是for-each不能改值
         */
        /*for (int num : nums) {
            System.out.println(num);
            num = 10;
        }

        for (int num : nums) {
            System.out.println(num);
        }

        for (int num, i = 0;i < nums.length; i++){
            num = nums[i];
            System.out.println(num);
        }*/

        int[] nums1 = {};
        System.out.println("长度为：" + nums1.length);
//        System.out.println(nums1[0]);

        //遍历之前，必须先判断数组是否为空
        if(nums1 != null) {
            for (int i=0;i<nums1.length;i++) {
                System.out.println(nums1[i]);
            }
        }

        if(nums1 != null) {
            for (int num:nums1) {
                System.out.println(num);
            }
        }

    }
}
