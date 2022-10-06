fun main(args: Array<String>) {


    var tirada1 : MutableList<Int> = mutableListOf(1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6)

    var tirada2 : MutableList<Int> = mutableListOf(0, 5, 1, 0, 9, 0, 10, 10, 8, 0, 9, 1, 0, 10, 8, 2, 8, 0)
    var tirada3 : MutableList<Int> = mutableListOf(10, 9, 0, 2, 6, 8 ,2, 10, 10, 4, 0, 10, 9, 0, 0, 10, 9)
    var tirada4 : MutableList<Int> = mutableListOf(10, 0, 2, 9, 0, 10, 7, 1, 9, 1, 10, 8, 2, 9, 1, 10, 9, 5)

    var tirada5 : MutableList<Int> = mutableListOf(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    var tiradaPerfecta : MutableList<Int> = mutableListOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)

    println("Maestro -> ${getScore(tirada1)} puntos")
    println("Jugador 1 -> ${getScore(tirada2)} puntos")
    println("Jugador 2 -> ${getScore(tirada3)} puntos")
    println("Jugador 3 -> ${getScore(tirada4)} puntos")
    println("Jugador 4 -> ${getScore(tirada5)} puntos")
    println("Jugada maestra -> ${getScore(tiradaPerfecta)} puntos")

}