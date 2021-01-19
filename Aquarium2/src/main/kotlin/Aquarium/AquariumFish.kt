package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish() {

    override val color = "gray"
    fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish() {

    override val color = "gold"

    fun eat() {
        println("munch on algae")
    }
}

interface FishAction {
    fun eat()
}
