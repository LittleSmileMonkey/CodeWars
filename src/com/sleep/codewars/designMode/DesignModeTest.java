package com.sleep.codewars.designMode;

import com.sleep.codewars.designMode.mediator.AbstractMediator;
import com.sleep.codewars.designMode.mediator.Defense;
import com.sleep.codewars.designMode.mediator.Department;
import com.sleep.codewars.designMode.mediator.Mediator;
import com.sleep.codewars.designMode.mediator.Ministry;

/**
 * DesignMode Test Class
 */
class DesignModeTest {
    public static void main(String[] args) {
        AbstractMediator abstractMediator=new Mediator();
        //发生天灾了，户部麻烦了，需要解决问题
        Department department=new Department(abstractMediator);
        department.dealDisaster();
        //要打仗了，兵部的活来了
        Defense defense=new Defense(abstractMediator);
        defense.fight();
        //皇帝发话了，工部赶紧建行宫
        Ministry ministry=new Ministry(abstractMediator);
        ministry.buildPalace();
    }
}
