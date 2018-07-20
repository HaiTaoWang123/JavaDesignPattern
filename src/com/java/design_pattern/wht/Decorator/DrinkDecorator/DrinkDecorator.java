package com.java.design_pattern.wht.Decorator.DrinkDecorator;

import com.java.design_pattern.wht.Decorator.Drink.Drink;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/19-16:42
 * @description 装饰者模式中, 所有装饰者的父类
 */
public abstract class DrinkDecorator extends Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink){
        this.drink = drink;
    }
}
