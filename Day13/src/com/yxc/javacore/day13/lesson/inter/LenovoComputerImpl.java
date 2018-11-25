package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：接口的实现类定义
 *
 * 一个类实现某个接口之后，需要实现该接口的说有抽象方法，变成一个可以去创建对象的可用类；
 * 或者将实现类变成抽象类，让该类去持有接口的抽象方法，该类用于再被其他的子类去继承。
 * 如果实现类只实现了接口中的个别几个抽象方法，没有完全实现所有的抽象方法，
 * 那该实现类依然得声明为抽象类。
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
//public abstract class LenovoComputerImpl implements IComputer{
public class LenovoComputerImpl extends LenovoComputerFather implements IComputer,II7{
    @Override
    public void usbFunction() {
        System.out.println("联想电脑实现USB接口功能！");
    }

    @Override
    public void keyBoardFunction() {
        System.out.println("联想电脑实现键盘录入功能！");
    }


    @Override
    public void i7Function() {
        System.out.println("联想酷睿i7处理器");
    }
}
