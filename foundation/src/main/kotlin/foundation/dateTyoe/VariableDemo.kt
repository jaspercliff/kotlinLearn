package foundation.dateTyoe;

// 顶层变量 public
val list = mutableListOf(1, 2, 3)
// 顶层常量  const和val的区别是const是可以在编译时就确定的
const val h = "hello"

class DataType {
// type inference 类型推断
    val name = "jasper"  //不可变变量
    var age = 20         //可变变量

    val x : Int = 0 //显式定义类型
    val y = 10;     // 自动推断类型
    val pi = 3.14   //自动推断类型 为double


    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

fun main() {
    var customer = 2

    customer = customer+2
    customer +=3
    customer *=2
    customer /= 2
    println(customer)
}