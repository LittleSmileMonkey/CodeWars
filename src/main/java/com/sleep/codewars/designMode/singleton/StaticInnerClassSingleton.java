package com.sleep.codewars.designMode.singleton;

/**
 * Created by Sleep on 2018/4/8.
 * <p>
 * E-mail: sleepym09@163.com
 *
 * 静态内部类模式：
 *     通过jvm类加载机制保证线程安全，并且是懒汉式，没有性能缺陷，也不依赖于JDK版本
 *
 */
public class StaticInnerClassSingleton {
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getSingleton(){
        return SingletonHolder.INSTANCE;
    }
}
