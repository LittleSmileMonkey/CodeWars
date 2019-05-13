package com.sleep.codewars.designMode.chain;

/**
 * author：xingkong on 2019-05-13
 * e-mail：xingkong@changjinglu.net
 *
 */
class ChainTest {
    public static void main(String[] args) {
        ConcreteOperationA operationA = new ConcreteOperationA();
        ConcreteOperationB operationB = new ConcreteOperationB();
        operationA.setNextOperation(operationB);
        operationA.handleMessage(new Object());
    }
}
