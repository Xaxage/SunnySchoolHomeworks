package homework3
import java.lang.IllegalArgumentException
import java.util.*

fun main() {
    val sc= Scanner(System.`in`)
    println("Please enter the number of elements")
    val count=sc.nextInt()
    if(count<=0)
        throw IllegalArgumentException()
    println("Please insert the elements")
    val list= MutableList<Int>(count){i->sc.nextInt()}
    println(list.toSet())
    sc.close()
}