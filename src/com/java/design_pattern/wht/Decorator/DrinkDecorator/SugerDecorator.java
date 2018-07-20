package com.java.design_pattern.wht.Decorator.DrinkDecorator;

import com.java.design_pattern.wht.Decorator.Drink.Drink;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/19-16:51
 * @description 加糖
 */
public class SugerDecorator extends DrinkDecorator{

    public SugerDecorator(Drink drink) {
        super(drink);
    }

    public void addSuger(){
        System.out.println("加糖了!");
    }

    @Override
    public int price() {
        return drink.price() + 5;
    }

    @Override
    public String getName() {
        addSuger();
        return "加糖的"+drink.getName();
    }
}
