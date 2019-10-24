enum class tipoEstado {
    DETENIDO, ARRIBA, ABAJO
}

class ElevadorClass(var piso: Int, var estado:tipoEstado) {

    var pis : Int = 0
    var opt: Int = 0

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

        if (piso > eleva ){
            estado= tipoEstado.ABAJO
        }
        if (piso < eleva){
            estado = tipoEstado.ARRIBA
        }
        if(piso == eleva){
            println("Estado elevador DETENIDO, Se encuentra en el piso al cual quiere moverse")
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