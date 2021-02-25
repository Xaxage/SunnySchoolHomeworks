package homework5

fun main() {
    val set1= setOf<Int>(1,1,1,1,1,1)
    val set2= setOf<Int>(1,1,1,1)
    val list: List<Int> = listFromSets(set1,set2)
    println(list)
}
fun listFromSets (set1:Set<Int>,set2:Set<Int>) : List<Int>{
    val result= mutableSetOf<Int>()
    for(i in set1){
        result.add(i)
    }

    for(i in set2){
        result.add(i)
    }

    return  result.toList()
}