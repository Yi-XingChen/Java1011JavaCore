package com.yxc.javacore.day13.lesson.inter;

/**
 * Copyright(c) 2018 YXC.All rights Reserved
 * <br />
 * 标题：领导定义了一个接口，对要实现的功能进行了相关的说明，
 * 要求每个新员工去提供实现方案
 * <p>
 * 注意：本内容仅限于学习用，禁止用于商业目的
 *
 * @author CaiSD
 * @version 1.0
 * @date 2018/11/23
 */
public interface IDemo01 {
    /**
     * 判断输入值的大小，于该值进行比较
     */
    public int MAX_SIZE = 100;

    /**
     * 对实现功能的说明
     */
    public void info();

    /**
     * 判断输入值是否大于MAX_SIZE,
     * 如果大于就返回false；如果小于就返回true
     * @param num 输入数据值
     * @return 返回结果，为Boolean类型
     */
    public boolean compareNum(int num);

}
