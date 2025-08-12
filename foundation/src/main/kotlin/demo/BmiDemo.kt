package com.jasper.demo


fun main(){
    val weight = 70
    val height = 1.75

    val bmi = weight / height
    println("bmi 是 %.2f".format(bmi))
    println("bmi分类：" + when{
        bmi < 18.5 -> "偏瘦"
        bmi <24.9 -> "正常"
        bmi < 29.9 -> "偏胖"
        else -> "肥胖"
    })
}