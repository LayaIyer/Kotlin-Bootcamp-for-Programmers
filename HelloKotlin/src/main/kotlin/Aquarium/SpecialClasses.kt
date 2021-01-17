package Aquarium

object MobyDickWhale {

    val author = "Herman Melville"

    fun jump() {
        //...
    }
}

enum class Color(val rgb: Int){
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}

sealed class Seal