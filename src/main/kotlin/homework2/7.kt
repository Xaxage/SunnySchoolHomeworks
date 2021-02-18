package homework2
import java.lang.System.`in`
import java.util.*

fun main() {
    val sc= Scanner(`in`)
    println("Input the letter")
    var letter=sc.nextLine()
    println("Input the number")
    var number=sc.nextInt()

    if(letter=="a" || letter=="c" || letter=="e" || letter=="g" ) {
        if (number % 2 == 0)
            println("White")
        else if (number % 2 != 0)
            println("Black")
    }

    else if(letter=="b" || letter=="d" || letter=="f" || letter=="h") {
        if (number % 2 == 0)
            println("Black")
        else if (number % 2 != 0)
            println("White")
    }
}


