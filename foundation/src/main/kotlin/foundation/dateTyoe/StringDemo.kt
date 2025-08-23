package com.jasper.foundation.dateTyoe

class Person(var name: String, var age: Int) {

}

fun main(){
    val customer = 10

//    string template
    println("there is customer $customer")
    val list = listOf("apple", "banana", "pine")
    println("list is $list")
//    string template  curly braces
    val person = Person("jasper", 30)
    println("person name is ${person.name} age is ${person.age}")

//    多行字符串 中不能使用转义符  输出$ 使用${'$'}
    val text = """
        this is multiline 
        this is ${person.name} sign 
        this is ${'$'} sign 
    """
    println(text)
}


