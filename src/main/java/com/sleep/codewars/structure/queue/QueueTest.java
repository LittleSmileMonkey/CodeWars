package com.sleep.codewars.structure.queue;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * author：xingkong on 2019/11/18
 * e-mail：xingkong@changjinglu.net
 */
class QueueTest {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        CircularQueueSelf circularQueueSelf = new CircularQueueSelf(3);
        result.add(String.valueOf(circularQueueSelf.enQueue(6)));
        result.add(String.valueOf(circularQueueSelf.Rear()));
        result.add(String.valueOf(circularQueueSelf.Rear()));
        result.add(String.valueOf(circularQueueSelf.deQueue()));
        result.add(String.valueOf(circularQueueSelf.enQueue(5)));
        result.add(String.valueOf(circularQueueSelf.Rear()));
        result.add(String.valueOf(circularQueueSelf.deQueue()));
        result.add(String.valueOf(circularQueueSelf.Front()));
        result.add(String.valueOf(circularQueueSelf.deQueue()));
        result.add(String.valueOf(circularQueueSelf.deQueue()));
        result.add(String.valueOf(circularQueueSelf.deQueue()));
        System.out.println(Arrays.toString(result.toArray()));
    }
}
