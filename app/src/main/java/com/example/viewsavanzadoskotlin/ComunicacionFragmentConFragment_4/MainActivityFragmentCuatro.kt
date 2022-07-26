package com.example.viewsavanzadoskotlin.ComunicacionFragmentConFragment_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.viewsavanzadoskotlin.R

class MainActivityFragmentCuatro : AppCompatActivity(), InterfaceComunicacion {
    private lateinit var transaction:FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment_cuatro)

        //Se ejecutan las funciones que contienen los fragments
        addFragmentA()
        addFragmentB()
    }

    //Se crean dos funcionas para agregar cada uno de los fragments
    private fun addFragmentA(){
        val fragmentA = FragmentEjemploA()
        transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.containerFragmentA, fragmentA, "fragmentA")
        transaction.commit()
    }

    private fun addFragmentB(){
        val fragmentB = FragmentEjemploB()
        transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.containerFragmentB, fragmentB, "fragmentB")
        transaction.commit()
    }


    /*Esta es la parte final de la logica de envio de datos, tercera parte (3°)
    //implementamos la interface dentro de la clase MainActivityFragmentCuatro y sobre escribimos sus metodos
    //con esto ya se implementa la interfaz de forma correcta*/

    //La funcion EnvioDatos ya tiene un dato dentro de su parametro que viene desde el FragmentoA, por lo que vamos a utilizar ese dato obtenido desde el activity
    override fun EnvioDatos(dato: String) {

        /*Primero declaramos una variable de tipo FragmentoEjemploB que tendrá asignado el fragmentMananger, este hará una busqueda por medio del Tag
        //para asi saber a que fragment nos estamos refiriendo, en este caso es el fragmentB, despues se realiza un cast para hacer referencia que es el FragmentEjemploB */
        var fragmentB:FragmentEjemploB = supportFragmentManager.findFragmentByTag("fragmentB") as FragmentEjemploB

        /*Al realizar el cast nos permitira visualizar los metodos que contiene el fragmentoB
        //por lo tanto hacemos uso del metodo datoRecibido y le enviamos al segundo fragment el valor caputurado desde la interfaz */
        fragmentB.datoRecibido(dato)
    }
}