open class VehiculoCustom (
    nombre: String, velocidadMaxima: Int, combustible: Int, aceleracion: Int, frenado: Int

): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {
    override fun acelerar() {
        if (combustible > 0) {
            if (velocidadActual + aceleracion > velocidadMaxima) {
                velocidadActual = velocidadMaxima
            } else {
                velocidadActual += aceleracion
            }
            combustible -= 1
            println("El vehículo ha acelerado. Velocidad actual: $velocidadActual km/h, Combustible restante: $combustible")
        } else {
            println("No queda combustible para acelerar.")
        }
    }
    override fun frenar() {
        if (velocidadActual - frenado < 0) {
            velocidadActual = 0
        } else {
            velocidadActual -= frenado
        }
        println("El vehículo ha frenado. Velocidad actual: $velocidadActual km/h")
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual
        println("El vehículo ha avanzado. Distancia total recorrida: $distanciaRecorrida km")
    }
}

