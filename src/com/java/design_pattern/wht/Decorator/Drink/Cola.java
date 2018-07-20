package com.java.design_pattern.wht.Decorator.Drink;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/19-16:26
 * @description
 */
public class Cola extends Drink{

    /**
     * 设置饮品的名称为啤酒
     */
    public Cola() {
        name = "可乐";
    }

    /**
     * 实现父类的抽象方法
     * @return 设置可乐的价格
     */
    @Override
    public int price() {
        return 15;
    }
}
