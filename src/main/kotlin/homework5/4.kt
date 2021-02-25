package homework5

fun main() {
    val list= mutableListOf<Int>(-3,-2,-1,0,1,2,3,-1)
    println(tripleList(list))//In previous homeworks I implemented println method.
}

fun tripleList (list:MutableList<Int>) : List<Int>{
    val newList= mutableListOf<Int>()
    for(i in 0 until list.size) newList.add(list[i]*list[i]*list[i])
    return newList
}