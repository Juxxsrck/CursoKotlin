// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)
fun main(args: Array<String>) {
    while (true) {
        println(
            """
        "Hola soy tu Bola 8 magica creada con Kotlin. ¿Cuál de estas opciones deseas realizar?
        1. Realizar una pregunta
        2. Mostrar respuestas
        3. salir
    """.trimIndent()
        )

        val valorIngresado = readLine()

        when (valorIngresado) {
            "1" -> realizarPregunta()
            "2" -> mostrarRespuestas()
            "3" -> { salir()
                break}
            else -> mostrarError()
        }
    }
}

fun mostrarError() {
    println("¡Oh!, parece que has elegido una opción no valida, intenta nuevamente.")
}

fun salir() {
    println("¡Hasta pronto!")
}

fun mostrarRespuestas() {
    println("""
        "Selecciona una opción"
        1. Mostrar respuestas
        2. Revisar solo las respuestas afirmativas
        3. Revisar solo las respuestas dudosas
        4. Revisar solo las respuestas negativas
    """.trimIndent())

    val opcionIngresada = readLine()
    when(opcionIngresada){
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_DUDOSA)
        "4" -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_NEGATIVA)
        else -> println("Respuesta no valida... Adiós!")
    }
}

fun mostrarRespuestasPorTipo(tipoDeRespuesta : String = "TODOS"){
    when(tipoDeRespuesta){
        "TODOS" -> respuestas.keys.forEach { respuesta -> println(respuesta)}
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA}
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }

        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA}
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA}
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }
    }
}
fun realizarPregunta(){
    println("Que pregunta deseas realizar")
    readLine()
    println("Asi que esa era tu pregunta... La respuesta a eso es: ")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}