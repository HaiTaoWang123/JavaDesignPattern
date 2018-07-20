package com.java.design_pattern.wht.Decorator.Drink;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/19-16:26
 * @description
 */
public class Beer extends Drink{

    /**
     * 设置饮品的名称为啤酒
     */
    public Beer() {
        name = "啤酒";
    }

    /**
     * 实现父类的抽象方法
     * @return 设置啤酒的价格
     */
    @Override
    public int price() {
        return 20;
    }
}
