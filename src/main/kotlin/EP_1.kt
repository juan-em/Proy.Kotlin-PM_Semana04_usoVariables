class EP_1 {
}

fun main(argumentos: Array<String>){
    println("Alumnos matriculados\n")
    print("Ingrese la sección :")
    val valor1 = readln().toInt()
    print("Ingrese el año: ")
    val valor2 = readln().toInt()
    print("\nLos alumnos matriculados son: ")
    when(valor1) {
        1 -> when(valor2){
            2018 -> print(45)
            2019 -> print(43)
            2020 -> print(44)
            2021 -> print(40)
        }
        2 -> when(valor2){
            2018 -> print(40)
            2019 -> print(38)
            2020 -> print(37)
            2021 -> print(34)
        }
        3 -> when(valor2){
            2018 -> print(36)
            2019 -> print(35)
            2020 -> print(30)
            2021 -> print(28)
        }
    }
}