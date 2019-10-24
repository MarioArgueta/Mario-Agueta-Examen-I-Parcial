fun main() {
    val Elevadorcito = ElevadorClass(1,tipoEstado.DETENIDO)
    Elevadorcito.funcionElevador()

    var opt : Int
    do{
        println("\n\nDesea seguir usando el Elevador?\n1.Si\n2.No")
        opt = readLine()!!.toInt()
        Elevadorcito.funcionElevador()
    }while (opt ==1)
}