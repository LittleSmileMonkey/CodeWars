package com.sleep.codewars.designMode.mediator;

/**
 * Created by Sleep on 2018/3/30.
 *
 * E-mail: sleepym09@163.com
 */
public class Ministry extends AbstractColleague{

    public Ministry(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void buildPalace(){
        super.mAbstractMediator.dealThing(Mediator.MINISTRY_CODE);
    }

    public void selfFunction(){
        System.out.println("要建筑图纸没问题，我尽量复制多几份");
    }
}
