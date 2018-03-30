package com.sleep.codewars.designMode.mediator;

/**
 * Created by Sleep on 2018/3/30.
 * <p>
 * E-mail: sleepym09@163.com
 */
public class Mediator extends AbstractMediator {

    public static final int DEPARTMENT_CODE=1;
    public static final int DEFENSE_CODE=2;
    public static final int MINISTRY_CODE=3;

    @Override
    public void dealThing(int code) {
        switch (code){
            case DEPARTMENT_CODE:
                this.dealDisaster();
                break;
            case DEFENSE_CODE:
                this.fight();
                break;
            case MINISTRY_CODE:
                this.buildPalace();
                break;
        }
    }

    //户部处理天灾
    private void dealDisaster(){
        System.out.println("户部：专挑轻活，其他的找别人干去。");
        super.mMinistry.selfFunction();
        super.mDefense.selfFunction();
    }
    //兵部打仗
    private void fight(){
        System.out.println("兵部：我只出人，剩下的找别人干去。");
        super.mDepartment.selfFunction();
        super.mMinistry.selfFunction();
    }
    //工部建行宫
    private void buildPalace(){
        System.out.println("工部：我只画图纸，其他的找别人干去。");
        super.mDepartment.selfFunction();
        super.mDefense.selfFunction();
    }
}
