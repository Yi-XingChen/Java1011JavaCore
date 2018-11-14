package com.yxc.javacore.day07.lesson;

/**
 * Copyright(c)2018 YXC.All rights Reserved
 * <br>
 * 数组的基础使用
 *
 * @author 3342
 * @version 1.0
 * @date 20181114
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 22;
        int num4 = 11;

        //数组的两种声明方式
        int nums1[];
        int[] nums2;

        //数组的初始化
        nums1 = new int[4];
        nums2 = new int[10];

        //声明并且初始化,虽然两种方式都可以，但是推荐第一种，就像主函数中的String[]
        int[] nums3 = new int[5];
        //int[5] nums4 = new int[];
        int nums4[] = new int[5];

        //给数组赋值
        nums3[0] = 11;
        nums3[1] = 12;
//        nums3[2] = 12.22;
        nums3[2] = 0;
        nums3[3] = 21;
        nums3[4] = 17;
        //nums3[5] = 29;//数组边界异常，能编译通过，不能执行
        System.out.println(nums3[3]);

        System.out.println(nums4[2]);
        System.out.println(nums4[4]);

        //引用数据类型的数组
        String[] strings = new String[4];
        Student[] student0 = new Student[3];
        String str = new String();
        Student student = new Student();
//        Student[] students = new Student()[3];//没有（）
        System.out.println(strings[3]);
        System.out.println(student0[1]);

        /*使用花括号直接进行元素的枚举时，
        不需要初始化数组的大小，声明数组大小反而会造成编译报错
         */
        long[] longs1 = new long[]{12,123,125L,256};
//        short[] shorts1 = new short{1,2,34,45,43};//不能少[]
//        long[] longs2 = new long[4]{12,12,123L,34};

        long[] longs3 = {123,12,234,34,345,45,43};
//        long[] longs3 = {123,12,234,34,345,45,43.233};//元素的类型一定要对应
        System.out.println(longs3[0]);
        System.out.println(longs3[1]);
        System.out.println(longs3[2]);
        System.out.println(longs3[3]);

        //引用数据类型赋值
        Student[] students1 = new Student[3];

        Student student1 = new Student();
        student1.stuId = 1;
        student1.name = "张三";
        students1[0] = student1;

        Student student2 = new Student();
        student2.stuId = 2;
        student2.name = "李四";
        students1[1] = student2;

        //引用数据类型的另一种赋值方式
        students1[2] = new Student();
        students1[2].stuId = 3;
        students1[2].name = "王五";

        System.out.println(students1[1].stuId);
        System.out.println(students1[0].name);
        System.out.println(students1[2].name);

        //引用数据类型数组的多个对象声明
        Student[] students2 = {new Student(),new Student(),new Student()};
        System.out.println(students2[0]); //不是null了
        System.out.println(students2[1]);
        students2[0].stuId = 11;
        students2[0].name = "zhangsan";
        students2[2].stuId = 13;
        students2[2].name = "wangwu";

        Student[] students3 = new Student[3];
        /*System.out.println(students3[0]);
        System.out.println(students3[1]);*/
        /*System.out.println(students3[0].stuId);
        System.out.println(students3[1].name);*/

        Student student3 = new Student();
        Student student4 = null;
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student3.stuId);
        System.out.println(student3.name);
        System.out.println("111111");
        student4.info();
        System.out.println(student4.stuId);
        System.out.println(student4.name);

    }
}
