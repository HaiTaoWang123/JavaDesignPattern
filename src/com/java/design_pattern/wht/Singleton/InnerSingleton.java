package com.java.design_pattern.wht.Singleton;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-11:38
 * @description 静态内部类单例
 */
public class InnerSingleton {
    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    private InnerSingleton (){

    }
    public static final InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
