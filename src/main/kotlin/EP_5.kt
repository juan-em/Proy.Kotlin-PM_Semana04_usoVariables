class EP_5 {
}
fun main(argumentos: Array<String>) {
    println("Separando números de letras\n")
    var lista = arrayListOf(1, 'K', 4, 'O', 2, 'T', 5, 6, 'L', 'I', 8, 'N')
    print("Lista original: ${lista}\n")
    var letras:String = ""
    var numeros:String = ""
    for (i in lista.indices){
        if ("${lista[i]::class.simpleName}" == "Char"){
            letras = letras + lista[i].toString()
        }
        else if ("${lista[i]::class.simpleName}" == "Int"){
            numeros = numeros + lista[i].toString()
        }
    }
    print("\nLetras: ${letras}\n")
    print("Números: ${numeros}\n")
}