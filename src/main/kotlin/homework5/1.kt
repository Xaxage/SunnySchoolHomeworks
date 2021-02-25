package homework5

fun main() {
    val list= mutableListOf(1,2,3,4,5)
    println(list)
    swap(3,1,list)
    println(list)
}
fun swap(a:Int,b:Int,list:MutableList<Int>){
    if(a<0 || b<0 || a>list.size-1 || b>list.size-1 || a==b) throw IllegalArgumentException()
    val tmpA=list[a]
    list[a]=list[b]
    list[b]=tmpA

}