package com.example.parque

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parque.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val TAG = "Hola"
            Log.d(TAG, "El Nombre del parque es ${binding.Nombre.text}")
            Log.d(TAG, "La descripción del parque es ${binding.Descripcion.text}")
            Log.d(TAG, "El Telefono del parque es ${binding.Telefono.text}")
            Log.d(TAG, "La Web del parque es ${binding.Web.text}")
            Log.d(TAG, "El Hora de apertura del parque es ${binding.Apertura.selectedItem}")
            Log.d(TAG, "El Hora de cierre del parque es ${binding.Cierre.selectedItem}")
            Log.d(TAG, "El parque tiene ${binding.Restaurante.isChecked}")
            Log.d(TAG, "El parque tiene ${binding.Deportes.isChecked}")
            Log.d(TAG, "El parque tiene ${binding.Mascotas.isChecked}")
            Log.d(TAG, "El parque tiene ${binding.Parque.isChecked}")

        }




    }
}