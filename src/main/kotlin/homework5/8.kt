package homework5

import java.util.*

fun main() {
    val map= mapOf(1 to "One",2 to "Two",3 to "Three",4 to "Four")
    println(getMinKeysValue(map))
    println(getMaxKeysValue(map))
}

fun getMinKeysValue(map:Map<Int,String>) : String{
    val set:Set<Int> = map.keys
    if(set.isEmpty()) throw EmptyStackException()
    return map[set.minOrNull()]!!
}

fun getMaxKeysValue(map:Map<Int,String>) : String{
    val set:Set<Int> = map.keys
    if(set.isEmpty()) throw EmptyStackException()
    return map[set.maxOrNull()]!!
}
