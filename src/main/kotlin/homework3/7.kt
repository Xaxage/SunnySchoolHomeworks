package homework3

fun main() {
    var check=true;
val list= mutableListOf<Int>(1,2,3,5,6,1)
    for(i in 0 until list.size-1){
        if(list[i]>list[i+1]) {
            check=false
            break
        }
    }
    when(check){
        true-> println("Yes, it is ascending")
        false-> println("No, it is not ascending")
    }
}