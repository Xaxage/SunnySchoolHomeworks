package homework2
import java.lang.System.`in`
import java.util.*

fun main() {
    println("Please enter the number to check.")
    val sc=Scanner(`in`)
    var num=sc.nextInt()
    when(num%2){
     0-> println("Its an EVEN number")
        else-> println("Its an ODD number")
    }
}