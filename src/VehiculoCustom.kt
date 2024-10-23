open class VehiculoCustom (
    nombre: String, velocidadMaxima: Int, combustible: Int, aceleracion: Int, frenado: Int

): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {
    override fun acelerar() {
        if (combustible > 0) {
            velocidadActual = (velocidadActual + aceleracion).coerceAtMost(velocidadMaxima)
            combustible -= 1
            println("El vehículo ha acelerado. Velocidad actual: $velocidadActual km/h, Combustible restante: $combustible")
        } else {
            println("No queda combustible para acelerar.")
        }
    }
    override fun frenar() {
        velocidadActual = (velocidadActual - frenado).coerceAtLeast(0)
        println("El vehículo ha frenado. Velocidad actual: $velocidadActual km/h")
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual
        println("El vehículo ha avanzado. Distancia total recorrida: $distanciaRecorrida km")
    }
}

