package com.jasper.foundation.function

fun main() {
    // normal stream
    fun upperCaseString(str: String): String = str.uppercase()
    println(upperCaseString("test"))
    val upperCaseString1= { text: String -> text.uppercase() }
    println(upperCaseString1("test122"))
    val numbers = listOf<Int>(1, 2, 3, 4)
    numbers.map { it*2 }.forEach { println(it) }

//pass to another function
    val positive = { x: Int -> x < 0 }
// 传入一个int 类型的参数 返回为boolean
    val negative: (Int) -> Boolean = { x: Int -> x > 0 }
    val list = listOf(1, 2, 3,-1,-2,-3)
    val positiveNumbers = list.filter(positive)
    val negateNumbers = list.filter(negative)

    println(positiveNumbers)
    println(negateNumbers)
    println("=============")

//    lambda可以从函数返回  (Int) -> Int 返回一个lambda表达式
    fun test(x: Int):(Int) -> Int{
        if (x >0){
            return { x-> x*2}
        }else{
            return {x -> x-2}
        }
    }

    val test = test(6)

    val list1 = listOf<Int>(1, 2, 3, 4)
    val list2 = list1.map(test)
    println(list2)

    println("================= 尾随lambda")

    // 传统语法
    listOf(1, 2, 3).forEach(  {x->println(x)})

    // 尾随 Lambda 语法（更常见） 当lambda是函数的最后一个参数时，可以将lambda放到（）外面
    listOf(1, 2, 3).forEach { println(it) }

    fun operator(x:Int,y:Int,operation:(Int,Int)-> Int):Int{
        return operation(x,y)
    }
    println(operator(5,6) { x,y -> x+y })
    println(operator(5,6) { x,y -> x*y})

//    尾随lambda
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
}