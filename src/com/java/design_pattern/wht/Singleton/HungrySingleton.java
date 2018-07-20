package com.java.design_pattern.wht.Singleton;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-11:11
 * @description 饿汉式单例,线程安全
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    /**
     * 提供公有的获取实例的静态方法
     * @return hungrySingleton
     */
    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
