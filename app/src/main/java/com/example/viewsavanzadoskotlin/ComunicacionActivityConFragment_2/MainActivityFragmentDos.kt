package com.example.viewsavanzadoskotlin.ComunicacionActivityConFragment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import com.example.viewsavanzadoskotlin.R

//Activity principal de este ejercicio
class MainActivityFragmentDos : AppCompatActivity() {

    //Se define el fragment manager
    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment_dos)

        //Se vinculan los widgets de la parte grafica con el codigo
        val etDato = findViewById<EditText>(R.id.etDato)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        //Se crea el evento del boton
        btnEnviar.setOnClickListener {

            //Se crea una variable para poder guardar lo que se escriba dentro del EditText y este debe ser un string
            var inf = etDato.text.toString()
            //Se define una variable de tipo entero para guardar un numero
            var number = 10
            //Se define un bundle para poder enviar los datos al fragment desde el activity
            var bundle = bundleOf()
            //En el bundle se pueden enviar cualquier tipo de datos pero se debe especificar en este caso es un string y un entero
            //El metodo putString y putInt significa que vamoos a colocar los valores dentro del bundle y dentro del parentesis nos piden
            //dos parametros uno hace referencia a la key que es el indentificador que tiene el bundle y la otra es el dato que queremos enviar al fragment
            bundle.putString("DATOS",inf)
            bundle.putInt("NUMERO", number)

            //Despues creamos el fragmento que vamos a meter en el activity
            val fragmentoEjemplo = FragmentEjemplo()
            //Aqui especificamos que al fragmento se le va enviar unos argumentos datos por medio del bundle
            fragmentoEjemplo.arguments = bundle
            //Definimos que el fragment manager va a realizar una transaccion
            val fragmentTransaction = fragmentManager.beginTransaction()
            //El tipo de transaccion es de añadir un fragment
            fragmentTransaction.add(R.id.fragmentContainer,fragmentoEjemplo)
            //Iniciamos la transaccion
            fragmentTransaction.commit()
        }
    }
}