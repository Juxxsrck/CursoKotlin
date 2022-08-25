/*
val largoDeValorInicial = superFuncion(valorInicial = "Hola") { valor ->
        valor.length
    }
    println(largoDeValorInicial)

    val lambda : () -> String = funcionInception("Stiven")
    val valorLambda : String = lambda()
    println(valorLambda)
}

fun superFuncion(valorInicial : String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

fun funcionInception (nombre : String) : () -> String{
    return {
        "Hola desde la lambda $nombre"
    }
 */