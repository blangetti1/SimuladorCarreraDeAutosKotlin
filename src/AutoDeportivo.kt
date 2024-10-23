class AutoDeportivo(nombre: String):
    VehiculoCustom(nombre, velocidadMaxima=220, combustible=80, aceleracion=15, frenado=10) {
    override fun toString(): String {
        return "Nombre: $nombre, Velocidad máxima: $velocidadMaxima , Combustible: $combustible , Aceleración: $aceleracion , frenado: $frenado"
    }
}
