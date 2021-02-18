package homework2

import java.lang.IllegalArgumentException
import java.lang.System.`in`
import java.util.*

fun main() {
    val sc=Scanner(`in`)
    println("Enter the number of elements.")
    var length=sc.nextInt()
    if(length<=0)
        throw  IllegalArgumentException()
    var count0=0
    var countPlus=0
    var countMinus=0
    while (length!=0){
        var num=sc.nextInt()
        if(num<0)
            countMinus++
        else if(num==0)
            count0++
        else
            countPlus++
        length--
    }

    println(" $countMinus negative \n $count0 0 \n $countPlus positive")
}