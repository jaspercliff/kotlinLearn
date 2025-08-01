package com.jasper.foundation

//object 原生支持的单例（Singleton）实现 线程安全
object MySingleton{
    fun hello() = println("I am hello")
}

fun main(){
    val singleton = MySingleton

    singleton.hello()

//     不算单例 相当于Java的static
    val obj = object{
        fun hello() = println("I am hello1")
    }
    obj.hello()
}