package com.jasper.foundation

class Control {
}

fun main() {
    val a = 10
    val b = 20
    val c =
        if (a > b)
            a
        else b
    println(c)

    var x = 85

    val d = when (x) {
        in 80..90 -> "优秀"
        in 60..80 -> "合格"
        else -> "不合格"
    }

    val h = when (x) {
        85 -> println(1)
        else -> {
            println(2)
        }
    }
    print(d)
    println(h)

    val range1 = 1..4
    println(range1.joinToString("-"))
    val range2 = 1..<4
    println(range2.joinToString("-"))
    val range3 = 4 downTo 1
    println(range3.joinToString("-"))   // 4 3 2 1
    val range4 = 'a'.. 'g' step 2
    println(range4.joinToString("-"))

    for (i in 1..5) {
        println(i)
    }
    val list = listOf(1, 2, 3, 4, 5, 6)
    for (element in list) {
        println(element)
    }

    var g = 0

    do {
        g++
    }while(g < 10)

    println("g = $g")
    var f = 0
    while (f < 10) {
        f ++
    }
    println("f = $f")
}

