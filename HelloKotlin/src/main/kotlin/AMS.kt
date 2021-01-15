import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}")
    feedTheFish()

    /*var bubbles = 0
    while (bubbles < 50){
        bubbles++
    }

    //repeat (function from standard library)
    repeat(2){
        println("A fish is swimming")
    }*/

    eagerExample()
}

fun eagerExample(){
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter { it[0] == 'p'}
    println(eager)

    //apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p'}
    println(filtered)
    println(filtered.toList())

    //apply map lazily
    val lazyMap = decorations.asSequence().map {
        println("map: $it")
            it
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}



fun getDirtySensorReading() = 20

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20) : Boolean{
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun makeNewAquarium() = println("Building a new aquarium......")

fun aquariumStatusReport(aquarium: Any = makeNewAquarium()){

}

fun isTooHot(temperature: Int) : Boolean = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"



fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty=50)
    shouldChangeWater(day = "Monday")

    if(shouldChangeWater(day)){
        println("Change the water today")
    }

}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun randomDay() : String{
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satuday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood (day : String) : String {
    var food = "fasting"
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitos"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}
