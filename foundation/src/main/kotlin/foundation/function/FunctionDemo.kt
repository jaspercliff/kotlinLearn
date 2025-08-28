package com.jasper.foundation.function

fun sum(x:Int,y: Int):Int {
    return x+y
}

//默认参数  Unit 代表函数没有返回值 类似java中的void 没有必要写
fun printHello(first: String,last:String = "world"): Unit {
    println("$first,$last")
}

// single-expression function 单表达式函数  可以使用=声明函数体  自动推断
fun sum1(x:Int,y:Int):Int = x+y


var names = mutableListOf<String>("jasper", "cliff")
var fruits = mutableListOf<String>("apple", "pine")

fun earlyReturn(name: String,fruit: String): String{
    if (name in names){
        return "name already in names";
    }
    if (fruit in fruits){
        return "name already in fruits";
    }
    return "all no in ";
}

fun main() {
    println("sum(5,10) = ${sum(5,10)}")
//    命名参数 包含参数名称 可以任意定义参数顺序
    println(" 命名参数 = ${sum(y=10,x=5)}")
    printHello("hello")
    printHello("Hello", "World1")

    println(earlyReturn("jasper", "watermelon"))
}

