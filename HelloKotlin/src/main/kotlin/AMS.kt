import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}")
    feedTheFish()

    /*val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${ if (temperature > 50) "fried" else "safe"} fish"
    println(message)*/
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
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
