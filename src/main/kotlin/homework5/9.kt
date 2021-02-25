package homework5

fun main() {
    val map= mutableMapOf<Int,String>()
    map[1] = "One"
    map[2] = "Two"
    map[3] = "Three"
    map[4] = "Four"
    map[10] = "Ten11"
    println(map)
    println(check(map))
}

fun check(map:MutableMap<Int,String>): MutableMap<Int,String> {
    val result = mutableMapOf<Int, String>()
    for (i in map.keys) {
        if (i > 5) {
            if (map[i]!!.length >= 3)//!! chem haskacel
                result[i] = map[i]!!//!! chem haskacel
        }
    }
    return result
}


