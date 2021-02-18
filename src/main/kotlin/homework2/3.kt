package homework2
import java.lang.System.`in`
import java.util.*

fun main() {
    val sc= Scanner(`in`)
    println("Please enter the number.")
    var num=sc.nextInt()
    var i=0

    while(i!=11){
        println("$num * $i = " + num*i)
        i++
    }
}