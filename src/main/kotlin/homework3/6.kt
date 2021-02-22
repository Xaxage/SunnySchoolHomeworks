package homework3

import java.lang.IllegalArgumentException
import java.lang.System.`in`
import java.util.*

fun main() {
    val sc= Scanner(`in`)
    println("Please enter the number of elements")
    val count=sc.nextInt()
    if(count<=0)
        throw IllegalArgumentException()
    println("Please insert the elements")
    val list= MutableList<Int>(count){i->sc.nextInt()}
    for(i in 0 until list.size/2){
        val tmp=list[i]
        list[i]=list[list.size-i-1]
        list[list.size-i-1]=tmp
    }
    println(list)
    sc.close()
}