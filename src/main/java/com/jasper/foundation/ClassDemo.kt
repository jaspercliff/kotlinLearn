package com.jasper.foundation

class Person(val name: String, var age: Int){
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

//kotlin 中所有类默认继承Any 类
val person = Person("Dmitry", 30)

fun main(){
    println(person.toString())
}