package com.sleep.codewars.designMode.chain;

/**
 * author：xingkong on 2019-05-13
 * e-mail：xingkong@changjinglu.net
 */
class ConcreteOperationA extends AbstractOperation {
    @Override
    void handleMessage(Object bundle) {
        System.out.println(getClass().getSimpleName() + " handleMessage invoke");
        startNextOperation(bundle);
    }
}
