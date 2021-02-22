package homework3

import java.lang.IllegalArgumentException
import java.lang.System.`in`
import java.util.*

fun main() {
    println("Please enter the number of elements in the list.")
    val sc= Scanner(`in`)
    var average=0
    var count=sc.nextInt()
    if(count<=0){
        throw IllegalArgumentException()
    }
    println("Please enter your elements")
    var list= MutableList<Int>(count){ _ ->sc.nextInt()}//I have no idea what "_" means
    for(i in list){
        average+=i
        print("$i  ")
    }
    println("\n"+ average/count)
    sc.close()


}