package com.jasper.foundation.classDemo

//主构造函数 val 和 var 直接在构造函数参数中声明，会自动生成属性和 getter/setter,不需要在类体内重复声明属性
class Person(val name: String, var age: Int){
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

//email 如果没有加val 或者var 不会变成类的属性
class User1(val name: String,var age: Int = 10,val  email: String) {
//    次构造函数
    constructor(name: String): this(name,0,"test") {
        println("secondary constructor called")
    }

    constructor(name: String, email: String): this(name,0,email) {
        println("secondary constructor called")
    }
//      init 会在次构造函数之前之前
    init {
        age = 50
    }
    constructor(age:Int): this("jasper", "jasper@qq.com" ){
        println("indirect delegate secondary constructor called")
    }

    override fun toString(): String {
        return "User1(name='$name', age=$age,email='$email')"
    }

}

// 不推荐
class User{
    var name = ""
    var age: Int = 0  // :int 可以省略 会自动推断
    var email = ""
    override fun toString(): String {
        return "User(name='$name', age=$age, email='$email')"
    }
}
//kotlin 中所有类默认继承Any 类

fun main(){
//    主构造函数
    val person = Person("Dmitry", 30)
    println(person.toString())
//    次构造函数
    val user1 = User1("John")
    println(user1.toString())

    val user11 = User1("Jane","test111")
    println(user11.toString())
//  间接委托
    val user12 = User1(20)
    println(user12.toString())
// 不推荐
    val user = User()
    user.name = "Bob"
    user.age = 35
    println(user.toString())
}