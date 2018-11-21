package com.yxc.javacore.day11.lesson;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：接收主函数调用时，传递的参数，使用args作为参数
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/21
 */
public class Demo04 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
