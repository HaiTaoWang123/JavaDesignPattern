package com.java.design_pattern.wht.Decorator.Drink;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/19-16:25
 * @description 装饰者模式中最顶级的父类
 */
public abstract class Drink {
    public String name;

    /**
     * 将饮品价格抽象化，让每个实现“饮品”类的子类自己定价
     * @return
     */
    public abstract int price();

    /**
     * 返回饮品的名称
     * @return
     */
    public String getName() {
        return name;
    }
}
