class Camion(nombre: String):
    VehiculoCustom(nombre, velocidadMaxima=90, combustible=150, aceleracion=5, frenado=8)

{
    override fun toString(): String {
        return "Nombre: $nombre, Velocidad máxima: $velocidadMaxima , Combustible: $combustible , Aceleración: $aceleracion , frenado: $frenado"
    }
}