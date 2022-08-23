package com.example.viewsavanzadoskotlin.EnvioDatosEntreActivities_01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R

class DatosEntreActivities : AppCompatActivity() {

    //Se declara la variable de tipo textView para luego ser inicializada
    private lateinit var texto:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_entre_activities)

        //Se inicializa el textView y el Button para vincular la parte grafica de la aplicacion y el codigo
        texto = findViewById<TextView>(R.id.txt_output)
        val boton = findViewById<Button>(R.id.btn_accion)

        //Se crea el setOnclick en el boton
        boton.setOnClickListener {
            //Se ejecuta la función que contiene la navegación de entre una actividad a otra y tambien el envio de datos
            navegarSegundaActivity()
        }
    }

    private fun navegarSegundaActivity() {
        //creamos una variable de tipo intent que nos permitira inicializar otra activity y en el mismo intent poder enviar datos
        val intent = Intent(this,ActivitySecundaria::class.java)
        //Se envia la información hacia la otra activity dandonle un identificador y el valor que queremos enviar
        intent.putExtra("nombre","Curso Android")
        /*siempre para inicializar otra activity se ponia startActivity y le pasamos el intent, pero en esta ocación
        //lo que vamos hacer es iniciarlizar la otra activity y cuando regrese nuevamente a esta activity nos pase un resultado
        //por eso se llama starActivityForResult que viene siendo un metodo que nos permite pasar a otra activity y a su vez
        //estamos esperando un resultado cuando este vuelva a esta activity, dentro de los parametros nos pide un intent y un requestCode,
        //El requestCode es un valor de tipo entero que puede ser cualquier numero, se pone este valor para pasarselo a la otra activity y este sepa
        //desde que activity proviene la respuesta*/
        startActivityForResult(intent, 1)
    }

    //Despues de volver de la segunda activity ejecutaremos este metodo, dentro de la función nos pedirá tres parametros los cuales son:
    //requestCode: este es un valor importante por que nos permite identificar de que activity proviene la respuesta ya que en este ejemplo solo navegamos
    //             de la primera activity a la segunda y sabemos que marcamos esa respuesta con el numero 1 pero si crearamos mas navegaciones en diferentes
    //             botones, y este valla de esta actividad y a una tercera con un requestCode 2, cuando regresemos de la tercera actividad probablemente
    //             tambien nos mande datos a esta actividad entonces como sabra de que el dato proviene de la activity 2 o 3? pues con el requestCode que se definio
    //             por eso es importante saber este dato para identificar de que actividad estamos esperando una respuesta cuando volvamos a la activity 1
    //ResultCode: en este parametro se obtiene el resultado de la respuesta desde la otra activity en este caso valorarizamos que si la respuesta fue satisfactoria
    //            podremos obtener el dato de la segunda activity
    //data: por ultimo este parametro obtendrá todos los datos que tiene el intent que se envio desde la otra activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //aqui preguntamos que si el requestCode que recibimos de la otra actividad es igual a 1, nosotros desde la otra activity no mandamos un requestCode
        //si no que se marco desde un principio de que esta actividad se le iva a poner un requestCode de 1 y de forma implicita lo guarda en cache diciendo de que la segunda
        //actividad proviene de un requestCode de 1
        if (requestCode == 1){
            //despues volvemos a evaluar para saber que si el resultado fue satisfactorio, sabemos que en el resulCode ya tiene un valor por que es el resultado de la respuesta
            //que se obtuvo al regresar a esta actividad, ya que recordemos que si enviamos esa respuesta desde la otra actividad, no como en el caso del requestCode que esta de forma implicita
            //por eso evaluamos de que si el resultado fue satisfactorio pues ejecutamos el bloque de codigo
            if (resultCode == Activity.RESULT_OK){
                //despues lo que haremos es guardar la información obtenida del intent en una variable, y para obtener ese dato usamos la varibale data que viene siendo el intent
                //y este puede ser nulla, despues definimos que el dato a obtener es un string y como parametro le ponemos el identificador que le pusimos en la segunda activity
                val nombre= data?.getStringExtra("nombre2")
                //depues ponemos en pantalla el valor obtenido en un textview
                texto.text = nombre
            }
        }
    }
}