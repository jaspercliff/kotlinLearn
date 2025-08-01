package com.jasper.foundation

class Function {
}

fun main() {

    fun add1(a: Int, b: Int): Int {
        return a + b
    }

    fun add2(a: Int,b: Int) = a+b

    val sum1 = add1(1, 5)
    println("sum1 = $sum1")
    val sum2 = add2(1, 6)
    println("sum2 = $sum2")
}