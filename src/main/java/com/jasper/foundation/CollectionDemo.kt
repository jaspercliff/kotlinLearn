package com.jasper.foundation

fun main() {
    val list = listOf(1, 2, 3, 4)
    val doubled = list.map { it * 2 }.filter { it > 5 }
    println(doubled)
}