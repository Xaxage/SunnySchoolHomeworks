package homework5

    fun main() {
        val list= mutableListOf<Int>(-3,-2,-1,0,1,2,3,-1)
        println(positiveList(list))
    }

    fun positiveList (list:MutableList<Int>) : List<Int>{
    val newList= mutableListOf<Int>()
        for(i in 0 until list.size){
            if(list[i]<0) continue
            newList.add(list[i])//add@ hamarvuma hatuk method ?Chem patkeracnum vonc aranc dra anem :(
        }
        return newList
    }