package com.jasper.foundation

import kotlin.random.Random

fun main(){
//    test = null  编译错误 string不能为null
    var name:String? = null  //可空类型
    val num = Random.nextInt(0,10)
    if (num>0){
        name = "jasper"
    }
    println(name?.length)   // 安全调用
    print(name?.length ?: "default")
}