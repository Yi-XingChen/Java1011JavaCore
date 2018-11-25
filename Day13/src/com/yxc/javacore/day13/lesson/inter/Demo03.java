package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：instanceof关键字的使用测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/25
 */
public class Demo03 {
    /**
     * 主函数.
     *
     * @param args
     */
    public static void main(String[] args) {
       /*Demo01Impl demo01 = new Demo01Impl();
        System.out.println(demo01 instanceof  Demo01Impl);
        System.out.println(demo01 instanceof  IDemo01);

        LenovoComputerImpl lenovoComputer = new LenovoComputerImpl();
        System.out.println(lenovoComputer instanceof LenovoComputerFather);
        System.out.println(lenovoComputer instanceof II7);
        System.out.println(lenovoComputer instanceof IComputer);*/


        /*//向上转型的过程，将子类对象赋值给父类类型
        LenovoComputerFather lenovoComputerFather = new LenovoComputerImpl();

        //向下转型，将父类对象赋值给子类
        LenovoComputerImpl lenovoComputer1 = (LenovoComputerImpl)lenovoComputerFather;
        //子类接口当中定义的方法
        lenovoComputer1.usbFunction();
        //子类继承于父类的方法
        lenovoComputer1.info();*/

        /*LenovoComputerFather lenovoComputerFather1 = new LenovoComputerFather();
        //报错
        //LenovoComputerImpl lenovoComputer2 = (LenovoComputerImpl)lenovoComputerFather1;
*/
        Demo03 demo03 = new Demo03();
        //不会报错
        //demo03.test(new LenovoComputerImpl());
        demo03.test(new LenovoComputerFather());

    }


    public void test(LenovoComputerFather lenovoComputerFather) {
        //这种直接进行强转的向下转型会报错
        /*LenovoComputerImpl lenovoComputer3 = (LenovoComputerImpl) lenovoComputerFather;
        lenovoComputer3.info();
        lenovoComputer3.usbFunction();*/

        if(lenovoComputerFather instanceof LenovoComputerImpl) {
            LenovoComputerImpl lenovoComputer4 = (LenovoComputerImpl) lenovoComputerFather;
            lenovoComputer4.usbFunction();
            lenovoComputer4.info();
        }else {
            lenovoComputerFather.info();
        }
    }
}
