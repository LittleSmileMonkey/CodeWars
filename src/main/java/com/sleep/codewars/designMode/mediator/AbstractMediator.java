package com.sleep.codewars.designMode.mediator;

/**
 * Created by sleep on 2018/3/30
 *
 * E-mail:sleepym09@163.com.
 *
 * 参考<>https://juejin.im/post/5a72c05951882522b552ad3b</>
 *
 * 抽象中介者 (尚书省)
 *
 * 1.优点
 * 中介者模式的优点就是减少类间的依赖，把原有的一对多的依赖变成了一对一的依赖，同事类只依赖中介者，减少了依赖，当然同时也降低了类间的耦合。
 * 2.缺点
 * 中介者模式的缺点就是中介者会膨胀得很大，而且逻辑复杂，原本N个对象直接的相互依赖关系转换为中介者和同事类的依赖关系，同事类越多，中介者的逻辑就越复杂。
 */
public abstract class AbstractMediator {
    protected Ministry mMinistry;
    protected Department mDepartment;
    protected Defense mDefense;

    public AbstractMediator() {
        mMinistry = new Ministry(this);
        mDepartment = new Department(this);
        mDefense = new Defense(this);
    }

    //中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void dealThing(int code);
}
