package homework2
import java.lang.System.`in`
import java.util.*

fun main() {
    val sc=Scanner(`in`)
    while (true){
        println("Please enter 2 numbers")
        var a = sc.nextInt()
        var b = sc.nextInt()
        println(a+b)
        println("Type 1 if you wanna repeat and 0 if you don't.")
        var check=sc.nextInt()
        if(check==0)
            break
    }
}