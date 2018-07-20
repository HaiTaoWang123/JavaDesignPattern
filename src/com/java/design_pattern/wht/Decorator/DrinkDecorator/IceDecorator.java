package com.java.design_pattern.wht.Decorator.DrinkDecorator;

import com.java.design_pattern.wht.Decorator.Drink.Drink;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/19-16:45
 * @description 加冰
 */
public class IceDecorator extends DrinkDecorator {

    public IceDecorator(Drink drink) {
        super(drink);
    }

    public void addIce(){
        System.out.println("加冰了！");
    }

    /**
     * 加冰之后价格需要加上冰的价格
     * @return
     */
    @Override
    public int price() {
        return drink.price() + 3;
    }

    /**
     * 加冰后名称发生改变
     * @return
     */
    @Override
    public String getName() {
        addIce();
        return "加冰的"+drink.getName();
    }
}
