package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：接口的定义与使用
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public interface IComputer {
    //    public final double usbType2 = 3.0;
//    public final static double usbType1 =2.5;
    /**
     * 默认就是public final static修饰，不能使用其他三个权限修饰符。
     *
     * 注意：不添加访问权限修饰符时，不是包访问权限，而是省略的public。
     * 常量命名全部大写，用下划线分隔
     */
    double USB_TYPE_1 = 2.0;

    /**
     * 因为没有public可能会引起歧义，所以会把它加上，而static、final一般不会，可以省略
     */
    public double USB_TYPE_2 = 3.0;

    //public abstract void usbFunction();
    //abstract void usbFunction();
    //void usbFunction();
    //同理，public也不省略
    public void usbFunction();

    public void keyBoardFunction();

    //在接口当中不能定义普通的成员方法，只能定义抽象方法
   /* public void usbFunction() {
        System.out.println("1111");
    }*/


}
