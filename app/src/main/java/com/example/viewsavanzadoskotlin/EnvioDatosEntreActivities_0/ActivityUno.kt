package com.example.viewsavanzadoskotlin.EnvioDatosEntreActivities_0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R

const val EXTRA_INTENT_ESCUELA = "ESCUELA"
const val EXTRA_INTENT_NOMBRE = "NOMBRE"
const val EXTRA_INTENT_DIRECCION = "DIRECCION"
const val EXTRA_INTENT_TELEFONO = "TELEFONO"

class ActivityUno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uno)

        //Se declaran cada uno de los widgets
        val etEscuela = findViewById<EditText>(R.id.etEscuela)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)

        val tvEscuelaInfo = findViewById<TextView>(R.id.tvEscuelaInfo)
        val tvNombreInfo = findViewById<TextView>(R.id.tvNombreInfo)
        val tvDireccionInfo = findViewById<TextView>(R.id.tvDireccionInfo)
        val tvTelefonoInfo = findViewById<TextView>(R.id.tvTelefonoInfo)

        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        //En cada EditText se le pone un valor
        etEscuela.setText("COBAEV")
        etNombre.setText("Alejandro de Jesús")
        etDireccion.setText("Calle Coyotl #68")
        etTelefono.setText("782 117 3740")


        //Este boton pasa los valores que tenia cada EditText a los TextViews correspondientes
        btnMostrar.setOnClickListener {
            tvEscuelaInfo.text = "El nombre de la escuela es: ${etEscuela.text}"
            tvNombreInfo.text = "Tu nombre es: ${etNombre.text}"
            tvDireccionInfo.text = "Tu dirección es: ${etDireccion.text}"
            tvTelefonoInfo.text = "Tu telefono es: ${etTelefono.text}"
        }

        //Este boton envia los datos hacia al otro activity
        btnEnviar.setOnClickListener {
            /*Se crea una variable de tipo intent, en los parametros se define primero la actividad en la que nos encontramos
            //en el segundo parametro se define la actividad que deseamos pasarnos en este caso es el ActivityDos */
            val intent = Intent(this,ActivityDos::class.java)
            /*por medio del intent se van a pasar los datos por medio del metodo putExtra
            //el metodo nos pide dos valores uno hace referencia al nombre que le pondremos al intent y el otro parametro hace
            //referencia al valor, puede ser entero, cadena, decimal, booleano, etc.*/
            intent.putExtra(EXTRA_INTENT_ESCUELA,etEscuela.text.toString())
            intent.putExtra(EXTRA_INTENT_NOMBRE, etNombre.text.toString())
            intent.putExtra(EXTRA_INTENT_DIRECCION, etDireccion.text.toString())
            intent.putExtra(EXTRA_INTENT_TELEFONO, etTelefono.text.toString())
            //Despues hacemos que se lance la otra actividad o que se pase al otro activity y al mismo tiempo se le envia un intent
            startActivity(intent)

            //Toast.makeText(this,etEscuela.text.toString(),Toast.LENGTH_SHORT).show()

        }
    }
}