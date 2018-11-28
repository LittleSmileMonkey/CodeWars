package com.sleep.codewars

import kotlin.test.assertEquals

/**
 * author：xingkong on 2018/11/27
 * e-mail：xingkong@changjinglu.net
 *
 */

fun main(args: Array<String>) {
    val split = "/123456/78945/13254/1252".split("/")
    val size = split.size
    assertEquals(size,4)
}

class SplitTest {

}