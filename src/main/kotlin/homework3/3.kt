package homework3

import java.lang.IllegalArgumentException
import java.lang.System.`in`
import java.util.*

fun main() {
    val sc=Scanner(`in`)

    println("Please enter the number of elements for your first list")
    val count1=sc.nextInt()
    if(count1<=0)
        throw IllegalArgumentException()
    println("Please enter the elements of your first list")
    val list1= MutableList<Int>(count1){ _ ->sc.nextInt()}

    println("Please enter the number of elements for your second list")
    val count2=sc.nextInt()
    if(count2<=0)
        throw IllegalArgumentException()
    println("Please enter the elements of your second list")
    val list2= MutableList<Int>(count2){ _ ->sc.nextInt()}

    //checking
    var firstIsLow=true
    if(list1.size>list2.size)
        firstIsLow=false

    if(firstIsLow) {
        for (i in list1.indices) {
            for (j in list2.indices) {
                if (list1[i] == list2[j]) {
                    println(list1[i])
                    break
                }
            }
        }
    }
    else{
        for (i in list2.indices) {
            for (j in list1.indices) {
                if (list1[i] == list2[j]) {
                    println(list2[i])
                    break
                }
            }
        }
    }
    sc.close()
}