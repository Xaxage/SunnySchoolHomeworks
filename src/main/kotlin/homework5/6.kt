package homework5

import java.util.*

fun main() {
    val map= mapOf(1 to "One",2 to "Two",3 to "Three",4 to "Four")
    println(keysToList(map))
}

fun keysToList(map:Map<Int,String>):MutableList<Int>{
    val list= mutableListOf<Int>()
    for(i in map.keys) list.add(i)
    if(list.isEmpty()) throw EmptyStackException()
    return list
}