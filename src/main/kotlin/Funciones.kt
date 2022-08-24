/*
fun main(args: Array<String>) {
    val fraseAleatoria = "En platzi nunca paramos de aprender"
    val fraseAleatoria2 = "En Platzi nunca paramos de aprender (2)".randomCase2()
    //val fraseOrdenadaAleatoriamente = randomCase(fraseAleatoria)
    //println(fraseOrdenadaAleatoriamente) //es igual a
    println(randomCase(fraseAleatoria))
    println()
    imprimirFrase(fraseAleatoria2)
}


fun imprimirFrase(frase : String) : Unit {
    println("Tu frase es: $frase")
}

fun randomCase(frase : String) : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    if (resultadoAleatorio.rem(2) == 0){
        return frase.toUpperCase()
    }else {
        return frase.toLowerCase()
    }
}

//Random case diferente con tipo

fun String.randomCase2() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    }else {
        this.toLowerCase()
    }
}
 */