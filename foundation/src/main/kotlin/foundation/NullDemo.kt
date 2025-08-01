package com.jasper.foundation

fun main(){
    val name:String? = null  //可空类型
    println(name?.length)   // 安全调用
    print(name?.length ?: "default")
}