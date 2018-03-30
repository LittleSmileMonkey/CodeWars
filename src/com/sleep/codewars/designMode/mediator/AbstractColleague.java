package com.sleep.codewars.designMode.mediator;

/**
 * Created by Sleep on 2018/3/30.
 * <p>
 * E-mail: sleepym09@163.com
 *
 * 抽象部门类
 */
public abstract class AbstractColleague {
    protected  AbstractMediator mAbstractMediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        mAbstractMediator = abstractMediator;
    }
}
