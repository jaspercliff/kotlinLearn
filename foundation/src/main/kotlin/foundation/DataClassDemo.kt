package com.jasper.foundation

// data class 用于简洁定义模型的类  替代java中的pojo
data class Human(val age: Int, val name: String)


fun main(){

    val person1 = Human(1,"Jasper")
    val person2 = Human(2,"Jasper")

    println(person1==person2)//自动比较值 而不是地址

    println(person1) //自动打印内容

    val(age,name ) =person1 //自动解构

    println(age)
    println(name)

    val person3 = person1.copy()
    println(person3)

    val person4 = person3.copy(age = 3)
    println(person4)

}