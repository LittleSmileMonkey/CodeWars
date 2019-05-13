package com.sleep.codewars.designMode.chain;

/**
 * author：xingkong on 2019-05-13
 * e-mail：xingkong@changjinglu.net
 */
abstract class AbstractOperation {
    private AbstractOperation nextOperation;

    public void setNextOperation(AbstractOperation nextOperation) {
        this.nextOperation = nextOperation;
    }

    public void startNextOperation(Object bundle) {
        if (nextOperation != null)
            nextOperation.handleMessage(bundle);
    }

    abstract void handleMessage(Object bundle);
}
