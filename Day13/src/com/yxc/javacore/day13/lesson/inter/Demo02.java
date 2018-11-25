package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：领导测试员工对接口功能的实现
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public class Demo02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
       /*IDemo01 iDemo01 = new Demo02Impl();
       iDemo01.info();
       System.out.println(iDemo01.compareNum(200));*/

       Demo02 demo02 = new Demo02();
       /*Demo01Impl demo01 = new Demo01Impl();
        demo02.test(demo01);*/
       demo02.test(new Demo01Impl());
       demo02.test(new Demo02Impl());

       /*IDemo01 iDemo01 = new IDemo01() {
           @Override
           public void info() {

           }

           @Override
           public boolean compareNum(int num) {
               return false;
           }
       };
       demo02.test(iDemo01);*/
       //参数式的匿名内部类
       demo02.test(new IDemo01() {
           @Override
           public void info() {

           }

           @Override
           public boolean compareNum(int num) {
               return false;
           }
       });


    }

    public void test(IDemo01 iDemo01) {
        iDemo01.info();
        iDemo01.compareNum(200);
    }
}
