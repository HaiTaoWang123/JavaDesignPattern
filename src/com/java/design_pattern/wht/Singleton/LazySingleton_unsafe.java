package com.java.design_pattern.wht.Singleton;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-11:33
 * @description 懒汉式单例，非线程安全
 */
public class LazySingleton_unsafe {
    private static LazySingleton_unsafe lazySingleton;//申明私有的静态引用

    //私有的构造器申明，防止直接外部类通过new来实例化单例
    private LazySingleton_unsafe(){}

    /**
     * 提供公有的获取实例的静态方法
     * @return  lazySingleton
     */
    public static LazySingleton_unsafe getLazySingleton(){
        if (null == lazySingleton){
            lazySingleton = new LazySingleton_unsafe();
        }
        return lazySingleton;
    }
}
