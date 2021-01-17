package Aquarium

fun main(args: Array<String>){

    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red") //false
    symptoms.contains("red spots") //true

    println(symptoms.subList(4, symptoms.size)) // [belly up]

    listOf(1, 5, 3).sum() //9

    listOf("a", "b", "cc").sumBy { it.length } //4

    /////////////////////////////////////////////////////////////
    val cures: Map<String, String> = mapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))

    cures.getOrElse("bloating") {"No cure for this"}

    val inventory: MutableMap<String, Int> = mutableMapOf("fish nets" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")
}


/*Practice program: reverse a list
fun main(args: Arrray<String>){

    val testList: List<Int> = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    println(reverseList(testList))
}

fun reverseList(list: List<Int>): List<Int> {
    val result: MutableList<Int> = mutableListOf<Int>()
    for(i: int in 0..list.size-1){
        result.add(list[list.size-i-1])
    }
    return result
}

fun reverseListAgain(list: List<Int>): List<Int> {
    val result; MutableList<Int> = mutableListOf<Int>()
    for(i:int in list.size - 1 downTo 0){
        result.add(list.get(i))
    }
    return result
}*/