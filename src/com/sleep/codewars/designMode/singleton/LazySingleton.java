package com.sleep.codewars.designMode.singleton;

/**
 * Created by Sleep on 2018/4/8.
 * <p>
 * E-mail: sleepym09@163.com
 *
 * 普通懒汉式：在需要单例的时候才创建，并返回单例
 * 缺点：在多线程中无法保证单例的唯一性，可能会创建出多个实例
 * 修复：该方式可以在getSingleton前用synchronized 保证线程安全，类似于双重锁校验机制。
 *
 */
public class LazySingleton {

    private static LazySingleton sLazySingleton;

    private LazySingleton(){}

    public static LazySingleton getSingleton(){
        if(sLazySingleton == null){
            sLazySingleton = new LazySingleton();
        }
        return sLazySingleton;
    }
}
