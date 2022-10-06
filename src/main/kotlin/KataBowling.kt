
fun getScore(tiradas : MutableList<Int>): Int {
    var puntaje: Int = 0
    var tiradaIndex: Int = 0
    for (frames in 1..10) {
        if (isStrike(tiradaIndex, tiradas)) { //Es un Strike
            puntaje += getStrikeScore(tiradaIndex, tiradas)
            tiradaIndex += 1
        } else if (isSpare(tiradaIndex, tiradas)) { // Es un spare
            puntaje += getSpareScore(tiradaIndex, tiradas)// sumar cada cuadro del score
            tiradaIndex += 2 //Avanzar 2 tiradas
        } else {
            puntaje += getPuntuacionEstandar(tiradaIndex, tiradas) // sumar cada cuadro del score estandar
            tiradaIndex+=2
        }

    }
    return puntaje
}

fun isSpare(tiradaIndex: Int, tiradas: MutableList<Int>): Boolean { // Validar si es un Spare
    return tiradas[tiradaIndex] + tiradas[tiradaIndex + 1] == 10
}

fun getSpareScore(tiradaIndex: Int, tiradas: MutableList<Int>): Int { //Calculcar el puntaje del Spare
    return tiradas[tiradaIndex] + tiradas[tiradaIndex + 1] + tiradas[tiradaIndex + 2]
}

fun isStrike(tiradaIndex: Int, tiradas: MutableList<Int>): Boolean { // Validar si es un Strike
    return tiradas[tiradaIndex] == 10
}

fun getStrikeScore(tiradaIndex: Int, tiradas: MutableList<Int>): Int { //Calculcar el puntaje del Strike
    return tiradas[tiradaIndex] + tiradas[tiradaIndex + 1] + tiradas[tiradaIndex + 2]
}

fun getPuntuacionEstandar(tiradaIndex: Int, tiradas: MutableList<Int>): Int { //Calcular puntaje estandar
    return tiradas[tiradaIndex] + tiradas[tiradaIndex + 1]
}