import java.lang.System.`in`
import java.util.*

fun main(args: Array<String>) {
    println("Please enter your even number.")
    val sc=Scanner(`in`)
    var number=sc.nextInt();

    for(i in number downTo 1){
        print(i)
        if(i!=1)
            print(",")
    }
}