package homework3

fun main() {
    val list1= listOf<Int>(1,2,3,4)
    val list2= listOf<Int>(5,6,7,8)
    val list3 = MutableList(list1.size+list2.size){0}//creating list with temp. elements
    for (i in list1.indices){
        list3[i]=list1[i]
    }
    for (i in list2.indices){
        list3[list1.size+i]=list2[i]
    }
    println(list3)
}