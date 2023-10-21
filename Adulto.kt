package com.example.clase4

class Adulto(
    private val nombre:String,
    private val edad: Int,
    private val profesion:String,
    private val estadoCivil: EstadoCivil
):Persona(nombre, edad), AccionesAdultos, Acciones
{
     override fun obtenerNombre():String {
        return "Mi nombre es:" + this.nombre

    }
    override fun obtenerEdad(): String {
        return "Mi edad es:" + this.edad

    }
    fun obtenerprofesion():String {
        return "Mi profesion es:" + this.profesion

    }

    override fun trabajar(): String {
        return "Estoy trabajando"
    }

    override fun estudiar(): String {
        return "Estoy estuiando"
    }


}

enum class EstadoCivil{
    CASADO,
    SOLTERO,
    DIVORCIADO,
    CONVIVENCIA,
    VIUDO
}

