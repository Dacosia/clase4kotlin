package com.example.clase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adulto1 = Adulto(nombre ="Daniela", edad = 36, profesion = "Estudiante", estadoCivil = EstadoCivil.Convivencia)
        Toast.makeText(this,adulto1.obtenerNombre(),Toast.LENGTH_LONG).show()
    }
}