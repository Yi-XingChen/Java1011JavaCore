package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：接口的使用测试
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public class Demo01 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //能通过类名直接调用，说明接口当中的成员变量一定是静态的
//        System.out.println(IComputer.usbType1);
        System.out.println(IComputer.USB_TYPE_1);

        //不能对变量进行修改，说明
//        IComputer.usbType1 = 2.0;

        /*接口不能创建对象，接口没有构造函数，接口当中都是全局常量，是static静态的内容，
        这些变量是属于接口本身的，并没有成员变量，也就不需要在堆内存中创建对象，
        不需要创建对象也就不需要提供构造函数。
        接口的功能是给类提供规范和标准。
         */
        //IComputer iComputer = new IComputer();

        LenovoComputerImpl lenovoComputer = new LenovoComputerImpl();
        //keyBoardFunction方法来源于IComputer接口
        lenovoComputer.keyBoardFunction();
        lenovoComputer.usbFunction();
        //i7Function()方法来源于II7接口
        lenovoComputer.i7Function();
        //System.out.println(lenovoComputer.USB_TYPE_1);
        //toString方法来源于顶级父类Object
        lenovoComputer.toString();
        //info方法来源于LenovoComputerFather类
        lenovoComputer.info();

        /*
        上面的这种用法也可以，但是不规范，下面的这种更规范
         */
        IComputer iComputer = new LenovoComputerImpl();
        iComputer.keyBoardFunction();
        //直接用接口调用，减少编译器解析成本
        //System.out.println(iComputer.USB_TYPE_1);
        System.out.println(IComputer.USB_TYPE_1);
        /*toString方法来源于顶级父类Object，接口作为类型作为声明时，
        默认会将顶级父类当中的方法表现出来，当非顶级父类Object的其他父类的方法会被接口规范屏蔽
         */
        iComputer.toString();
        //iComputer.info();

        IComputer iComputer1 = new IComputer() {
            @Override
            public void usbFunction() {
                System.out.println("匿名内部类的USB功能实现");
            }

            @Override
            public void keyBoardFunction() {
                System.out.println("匿名内部类的键盘输入功能实现");
            }
        };
        iComputer1.keyBoardFunction();
        iComputer1.usbFunction();
        System.out.println(iComputer1.USB_TYPE_1);
        System.out.println(IComputer.USB_TYPE_1);

    }
}
