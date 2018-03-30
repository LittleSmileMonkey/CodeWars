package com.sleep.codewars.designMode.mediator;

/**
 * Created by sleep on 2018/3/30
 *
 * E-mail:sleepym09@163.com.
 *
 */
public class Department extends AbstractColleague{

    public Department(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void dealDisaster(){
        super.mAbstractMediator.dealThing(Mediator.DEPARTMENT_CODE);
    }

    public void selfFunction(){
        System.out.println("要钱没问题，我尽量搜刮点民脂民膏。");
    }
}
