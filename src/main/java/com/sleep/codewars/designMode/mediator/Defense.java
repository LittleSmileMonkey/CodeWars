package com.sleep.codewars.designMode.mediator;

/**
 * Created by Sleep on 2018/3/30.
 *
 * E-mail: sleepym09@163.com
 */
public class Defense extends AbstractColleague{
    public Defense(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void fight(){
        super.mAbstractMediator.dealThing(Mediator.MINISTRY_CODE);
    }

    public void selfFunction(){
        System.out.println("兵部：要人没问题，我尽量抓多几个壮丁");
    }
}
