open class PistaCustom (
    longitud: Int,
    clima: String,
    )

    :Pista(longitud, clima )

{
    override fun aplicarCondiciones(vehiculo: Vehiculo)
    {
        if(clima == "normal")
        {
            vehiculo.velocidadActual*1
        }
    else    if(clima == "soleado")
    {
        vehiculo.combustible * 0.05    }
        else if (clima == "niebla")
    {
        vehiculo.velocidadActual*0.8
        }
        else if(clima == "lluvia")
    {
        vehiculo.velocidadActual*0.5        }


    }
    override fun cambiarClima()
    {
        val climas = arrayListOf("niebla", "lluvia", "soleado", "normal")
        this.clima = climas.random()
    }
    override fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
        val eventosAleatorios = arrayListOf("Pinchazo", "Fallo_Mecanico", "Encontrar_Combustible")
        val evento = eventosAleatorios.random()

        if (evento == "Pinchazo") {
            vehiculo.frenar()
        }
        else if (evento == "Fallo_Mecanico")
        {
            vehiculo.velocidadActual=0
        }
        else if (evento == "Encontrar_Combustible"){
           vehiculo.combustible*1.20
        }
    }

}
