class Moto(nombre: String) :
    VehiculoCustom(nombre, velocidadMaxima=180, combustible=60, aceleracion=20, frenado=15) {
    override fun toString(): String {
        return "Nombre: $nombre, Velocidad máxima: $velocidadMaxima , Combustible: $combustible , Aceleración: $aceleracion , frenado: $frenado"
    }
}
