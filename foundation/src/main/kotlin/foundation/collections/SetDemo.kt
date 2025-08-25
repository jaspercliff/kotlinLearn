package com.jasper.foundation.collections

fun main() {
    val set = setOf(1, 2, 3,3)
    println("set = $set")
    val set1: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)
    set1.add(5)
    set1.remove(3)
    println("set1 = $set1")

    println("set1 size = ${set1.size}")
    println("is 2 in set1 = ${set1.contains(2)}")
    println("is 2 in set1 = ${2 in set1}")
}

