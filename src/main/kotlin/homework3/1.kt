import java.util.*

fun main(args: Array<String>) {
    val array = arrayOf<String>("10","20","30","40","50")
    //println(Arrays.toString(addElementInArray(array,"40")))
    println(Arrays.toString(removeElementFromArray(array,"30")))
    //println(copyArray(array).contentToString())
}

fun addElementInArray(array:Array<String>,newElement: String) :Array<String?>{
    var array2: Array<String?> = arrayOfNulls(array.size+1)
    var i=0;
    while(i!=array.size){
        array2[i]=array[i]
        i++
    }
    array2[array.size]=newElement
    return array2
}

fun removeElementFromArray(array:Array<String>, element: String) :Array<String?>{//I am not going to optimise this. I am too young for this :D
    //I could just create an array with (array.size-1) number of "".I was just curious about null handling.
    var array2: Array<String?> = arrayOfNulls(array.size-1)
    var chosen=0
    var i=0;
    while(i!=array.size-1 && array[0]!=element){//Checking if it contains
        array2[i]=array[i]
        if(array2[i]==element){
            chosen=i
            break
        }
        i++
    }
    if(chosen!=0 && array[0]!=element){
        while(chosen!=array.size-1){
            array2[chosen]=array[chosen+1]
            chosen++
        }
    }

    var j=0
    if(array[0]==element){
        while(j!=array2.size){
            array2[j]=array[j+1]
            j++
        }
    }
    return array2
}

fun copyArray(array:Array<String>):Array<String?>{
    var array2: Array<String?> = arrayOfNulls(array.size)
    var i=0
    while (i!=array2.size){
        array2[i]=array[i]
        i++
    }
    return array2
}