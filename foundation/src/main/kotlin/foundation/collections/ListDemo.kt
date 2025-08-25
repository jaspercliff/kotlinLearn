package com.jasper.foundation.collections


fun main() {
    val list = listOf(1, 2, 3, 4)
    val filterList = list.map { it * 2 }.filter { it > 3 }
    println(filterList)

    val list1: MutableList<String> = mutableListOf("one", "two", "three", "four")
    list1.add("five")
    println(list1)

    val list2: List<String> = list1
    println(list2)
    list1.add("six")
    println(list2)  //1 2 3 4 5 6

    val toMutableList = list.toMutableList()
    toMutableList.add(5)
    println(toMutableList)
    println(toMutableList[2])
    println(toMutableList.first())
    println(toMutableList.last())
    println("toMutableList size ${toMutableList.count()}")
    println("2 是否在 toMutableList: ${2 in toMutableList}")
    toMutableList.remove(1)
    toMutableList.remove(3)
    toMutableList.removeAt(0) //2
    println(toMutableList)

}