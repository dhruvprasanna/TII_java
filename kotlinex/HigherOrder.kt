package kotlinex

class HigherOrder {

}
fun calc(x:Int, y:Int, op:(Int,Int) -> Int): Int{
    return op(x,y)
}
fun main() {
    println(calc(3,4, ::minOf) )

}

