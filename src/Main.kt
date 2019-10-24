fun main(){

    val LugarPiso: String?
    println("Ingrese el piso al que desea ir:")
    LugarPiso = readLine().toString()

    var Eleva: ElevadorClass = ElevadorClass(piso = LugarPiso)
}