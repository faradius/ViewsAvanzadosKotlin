package com.example.viewsavanzadoskotlin.EnvioDatosEntreActivities_01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R

class ActivitySecundaria : AppCompatActivity() {

    //Creamos una variable global de tipo String inicializado como vacio permitiendo de que esta variable puede ser nula con el signo de interrogación
    private var nombre: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundaria)

        //Declaramos los componentes visuales de la aplicación
        val boton = findViewById<Button>(R.id.btn_back)
        val texto = findViewById<TextView>(R.id.txt_output2)

        //Por medio del intent obtenemos los datos y con el extras definimos que vamos a meter cualquier tipo de dato dentro del bundle y que este puede ser null, por lo tanto
        //si el bundle no obtiene ningun valor entonces la aplicación se cerrará abruptamente por lo que no queremos eso, por lo tanto lo que se puede hacer
        //es validar de que el bundle no venga vacio y se puede hacer con la setencia if pero para este caso escogeremos la opción let, este nos permite validar
        //de que si el bundle viene vacio o es null no se va ejecutar thodo lo que tenga el bloque de codigo let, esto es mas legible y facil de entender
        intent.extras?.let { bundle ->
            //en la variable que declaramos anteriormente le pasaremos lo que tiene el bundle, en este caso es un string por lo tanto se utiliza el metodo getString
            //despues como parametro le indicamos el mismo indetificador que le definimos en la activity anterior (DatosEntreActivities)
            nombre = bundle.getString("nombre")
        }

        //Despues mostramos el dato obtenido de la activity anterior en un texview
        texto.text = nombre

        //en el boton implementamos el evento click
        boton.setOnClickListener {
            //para regresar a la acitividad anterior no definiremos en el intent de que activity a que activity nos pasaremos, en este caso solo declararemos un intent vacio
            val intent = Intent()
            //pero aqui definimos el dato que le queremos pasar cuando regresemos al activity anterior
            intent.putExtra("nombre2","Hola desde la segunda activity")
            //Despues de definir que es lo que le queremos pasar al activity cuando regresemos a ella, le enviaremos esa información por medio del metodo
            //setResult y este nos pide dos parametro un result code y un intent, el result code debe de ser distinto al request Code que fue utilizado en el activity anterior
            //por lo tanto simplemente se utilizará un valor ya definido por android que es RESULT_OK, esto es mas simple de entender ya que nos indica de que si el resultado
            //de la activity es correcto podremos enviar la información que contiene el intent
            setResult(Activity.RESULT_OK, intent)
            //con el metodo finish indicamos que vamos a destruir la actividad actual y volveremos a la actividad anterior
            finish()
        }
    }
}