package com.sleep.codewars.designMode.singleton;

/**
 * Created by Sleep on 2018/4/8.
 * <p>
 * E-mail: sleepym09@163.com
 *
 * 双重锁懒汉式
 *
 * 通过判空和synchronized保证多线程下单例唯一性，该方法依然存在缺陷性，即getSingleton方法中的instance = new Singleton();
 * 语句不具有原子性，这句话大概做了下面三件事情：
 * 1.给 instance 分配内存
 * 2.调用 Singleton 的构造函数来初始化成员变量
 * 3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 * 会被重新排序如果先执行3 则其他线程会返回一个为被实例化的instance对象，从而报错。
 *
 * 修复：将instance声明称volatile
 *
 * 缺陷：复杂，并且在java 5 之前volatitle是有缺陷的。
 *
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton sSingleton;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getSingleton(){
        if (sSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (sSingleton == null) {
                    sSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return sSingleton;
    }
}
