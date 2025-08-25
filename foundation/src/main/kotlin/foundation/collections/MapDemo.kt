package com.jasper.foundation.collections

fun main() {

    val map = mapOf("apple" to 2, "pine" to 3)
    println("map = $map")
    val map1: MutableMap<String, Int> = mutableMapOf("apple" to 2)
    println("map1 = $map1")

    println("map[apple] =  ${map["apple"]}")

    map1["apple"] = 3
    map1["pine"] = 4
    println("map1 = $map1")

    map1.remove("apple")
    println("map1 is $map1")
    println("map1 size is ${map1.count()}")

    println(map1.containsKey("apple"))

    println(map1.keys)
    println(map1.values)

    println("is pine in map1 keys = ${"pine" in map1.keys}")

}