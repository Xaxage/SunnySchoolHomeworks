package homework2
import java.lang.System.`in`
import java.util.*

fun main() {
    val sc=Scanner(`in`)
    val random = (1..20).random()
    println("Input a number")
    var guess =sc.nextInt()

    while(guess!=random){
        if(guess>random)
        println("Wrong, go lower.")
        else if(guess<random)
            println("Wrong,go higher.")
        guess =sc.nextInt()
    }
    println("Noice")
    sc.close()
}