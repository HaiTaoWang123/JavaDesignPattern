package com.java.design_pattern.wht.Decorator;

import com.java.design_pattern.wht.Decorator.Drink.Beer;
import com.java.design_pattern.wht.Decorator.Drink.Cola;
import com.java.design_pattern.wht.Decorator.Drink.Drink;
import com.java.design_pattern.wht.Decorator.DrinkDecorator.IceDecorator;
import com.java.design_pattern.wht.Decorator.DrinkDecorator.SugerDecorator;

public class Decorator_Main {

    public static void main(String[] args) {
	// write your code here

        //装饰者模式测试
        Drink beerDrink = new IceDecorator(new SugerDecorator(new Beer()));
        System.out.println("饮品名:" + beerDrink.getName() + "---价格:" + beerDrink.price());
        Drink colaDrink = new SugerDecorator(new IceDecorator(new Cola()));
        System.out.println("饮品名:" + colaDrink.getName() + "---价格:" + colaDrink.price());
    }
}
