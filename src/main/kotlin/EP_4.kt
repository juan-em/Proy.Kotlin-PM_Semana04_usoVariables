class EP_4 {
}
fun main(argumentos: Array<String>) {
    println("Serie de Fibonacci\n")
    var a = 0
    var b = 1
    var rpta:String? = null
    print("Ingrese el número de elementos: ")
    val n = readln().toInt()
    when (n) {
        1 -> rpta = a.toString()
        2 -> rpta = a.toString() + " ,${b}"
        else -> {
            rpta = a.toString() + " ,${b}"
            for (i in 0..n-3){
                var c = a + b
                rpta = rpta + " ,${c}"
                a = b
                b = c
            }
            print("\nLista de números: ")
            print(rpta)
        }
    }
}