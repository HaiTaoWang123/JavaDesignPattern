package com.java.design_pattern.wht.Singleton;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/7/20-11:37
 * @description
 */
public class LazySingleton_doublelock {
    //使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
    private static volatile LazySingleton_doublelock lazySingleton;

    //私有的构造器申明，防止直接外部类通过new来实例化单例
    private LazySingleton_doublelock(){
    }

    /**
     * 提供公有的获取实例的静态方法
     * @return
     */
    public static LazySingleton_doublelock getLazySingleton() {
        if(null == lazySingleton){
            synchronized (LazySingleton_doublelock.class){
                if(null == lazySingleton){
                    lazySingleton =  new LazySingleton_doublelock();
                }
            }

        }
        return lazySingleton;
    }
}
