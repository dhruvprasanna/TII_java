package kotlinex
class Kotlintest {
}

fun main() {

    var msg: String = "kotlin"
    println(msg)
    var s1 = Student2("dhruv", 21, true)
    println(s1.name)
    printer("test",5)
    println(test(24))


}
fun printer(msg:String, n: Int){
    for (i in 1..n){
        println(msg)
    }
}

fun test(i:Int, j:Int = 1):Int = i*j

