package com.sleep.codewars.designMode.singleton;

/**
 * Created by Sleep on 2018/4/8.
 * <p>
 * E-mail: sleepym09@163.com
 *
 * 饿汉式：在类加载的时候通过 static final保证单利被实例化，并且依赖于jvm本身机制保证线程安全
 *
 * 缺点：因为在类加载的时候就初始化，无法获取到参数，因此对于一些需要参数的单例，饿汉式都是无法满足需求的。
 *
 */
public class HungerSingleton {
    private static final HungerSingleton HUNGER_SINGLETON = new HungerSingleton();

    private HungerSingleton(){}

    public static HungerSingleton getHungerSingleton(){
        return HUNGER_SINGLETON;
    }
}
