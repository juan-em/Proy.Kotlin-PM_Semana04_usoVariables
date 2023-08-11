class EP_3 {
}
fun main(argumentos: Array<String>) {
    println("Código de usuario\n")
    print("Ingrese el nombre de usuario: ")
    val name = readln().toString()
    var x = name[0].toString()
    for (i in name.indices){
        if (name[i] == ' '){
            x = x + name[i+1].toString()
        }
    }
    print("\nEl código del usuario es: ")
    print(x)
}