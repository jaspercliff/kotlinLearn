package com.jasper.foundation

class Control {
}

fun main() {
    val a = 10
    val b = 20
    val c = if (a > b) a else b
    print(c)

    var x = 85

    val d =  when (x) {
        in 80..90 -> "优秀"
        in 60..80 -> "合格"
        else -> "不合格"
    }

    print(d)
}
