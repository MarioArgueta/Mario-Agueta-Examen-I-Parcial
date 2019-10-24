enum class tipoEstado {
    DETENIDO, ARRIBA, ABAJO
}

class ElevadorClass(var piso: Int, private var estado:tipoEstado) {

    var pis : Int = 0

    fun funcionElevador(){
        if(estado == tipoEstado.DETENIDO ){
            detener()
        }
        if(estado == tipoEstado.ARRIBA){
            subir()
        }
        if(estado == tipoEstado.ABAJO){
            bajar()
        }
    }
    fun detener(){
        println("Estado del elevador DETENIDO, en el piso $piso")

        val eleva: Int?
        println("Ingrese al piso que desea ir: ")
        eleva = readLine()!!.toInt()
        pis=eleva

        if (pis > eleva ){
            estado= tipoEstado.ABAJO
        }
        if (pis < eleva){
            estado = tipoEstado.ARRIBA
        }
        if(pis == eleva){
            println("")
        }
    }
    fun subir(){
        println("Estado del elevador ARRIBA, piso $piso")
        while(piso < pis)
        {
            piso++
            Thread.sleep(1000)
            println("Estado del elevador ARRIBA, piso $piso")

        }
        estado=tipoEstado.DETENIDO
    }
    fun bajar(){
        println("Estado del elevador ABAJO, piso $piso")
        while (piso > pis){
            piso--
            Thread.sleep(1000)
            println("Estado del elevador ABAJO, piso $piso")
        }
    }



}