package com.example.viewsavanzadoskotlin.EnvioDatosEntreActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.viewsavanzadoskotlin.R



class ActivityDos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)

        //Se declaran cada uno de los widgets
        val tvEscuela = findViewById<TextView>(R.id.tvEscuela)
        val tvNombre = findViewById<TextView>(R.id.tvNombre)
        val tvDireccion = findViewById<TextView>(R.id.tvDireccion)
        val tvTelefono = findViewById<TextView>(R.id.tvTelefono)

        //Se crea una variable para que almacene los datos que son enviados desde el otro activity por medio del intent
        var bundle_datos = intent.extras
        //Se crea una variable en el cual se almacenará el dato que queramos recuperar
        //El bundle o intent puede que lleguen datos nulos y se obtiene cada uno de los valores por medio del name o nombre
        //que se declaro anteriormente como referencia de cada dato que se iba enviar desde el otro activity y es necesario poner el mismo
        //nombre como se referencio en el activity anterior por que si no, no se podra recibir el dato
        var datoEscuela = bundle_datos?.getString(EXTRA_INTENT_ESCUELA)
        var datoNombre = bundle_datos?.getString(EXTRA_INTENT_NOMBRE)
        var datoDireccion = bundle_datos?.getString(EXTRA_INTENT_DIRECCION)
        var datoTelefono = bundle_datos?.getString(EXTRA_INTENT_TELEFONO)


        //En cada TextView se colocan los respectivos valores recibidos por el intent
        tvEscuela.text = datoEscuela
        tvNombre.text = datoNombre
        tvDireccion.text = datoDireccion
        tvTelefono.text = datoTelefono
        //Toast.makeText(this,dato,Toast.LENGTH_SHORT).show()
    }
}