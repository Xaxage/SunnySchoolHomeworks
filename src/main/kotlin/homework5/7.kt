package homework5

import java.util.*

fun main() {
    val map= mapOf(1 to "One",2 to "Two",3 to "Three",4 to "Four")
    println(valuesToList(map))
}

fun valuesToList(map:Map<Int,String>):MutableList<String>{
    val list= mutableListOf<String>()
    for(i in map.keys) list.add(map[i]!!)//!! chem haskacel
    if(list.isEmpty()) throw EmptyStackException()
    return list
}