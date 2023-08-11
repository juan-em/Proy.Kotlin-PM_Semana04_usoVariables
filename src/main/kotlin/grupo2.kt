class grupo2 {
    var primer_integrante = ""
        set(value) {
            field = "Primer Integrante: " +value
        }
    var segundo_integrante = "Arturo"
        get(){
            return "Hola segundo integrante: "+ field
        }
}
fun main(argumentos: Array<String>) {
    var grupo2 = grupo2()
    grupo2.primer_integrante="Kevin\n"
    println(grupo2.primer_integrante)
    println(grupo2.segundo_integrante)
}