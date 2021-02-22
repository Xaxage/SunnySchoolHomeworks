package homework3

fun main() {
    val list= mutableListOf<Int>(5,4,3,2,1)
    println(list)
    for(i in 0 until list.size){
        for(j in 0..list.size-i-2){
            if(list[j]>list[j+1]){
                val tmp=list[j]
                list[j]=list[j+1]
                list[j+1]=tmp
            }
        }
    }
    println(list)
}