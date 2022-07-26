package com.example.viewsavanzadoskotlin.ComunicacionFragmentConActivity_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.example.viewsavanzadoskotlin.R

//Implementamos la interface que creamos y añadimos los metodos correspondientes
class MainActivityFragmentTres : AppCompatActivity(), InterfaceFragment {
    /*Se declaran las variables desde la clase, es necesario poner el lateinit por que si no marca error
    //no se puede declarar la variable como en java, al hacer uso de lateinit estamos dandole mayor seguridad
    //al codigo, es decir que se van a inicializar despues y que por el momento solo se declaran la variables*/

    //Las variables que se declaran es la del administrador de fragments y el textview
     private lateinit var fragmentManager:FragmentManager
     private lateinit var tvText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment_tres)
        //Aqui se inicializa el textview vinculando el widget desde la parte grafica junto con el codigo
        tvText = findViewById(R.id.textoPrueba)

        //Inicializamos el fragmentManager
        fragmentManager = supportFragmentManager
        //Ejecutamos la funcion para agregar un fragment
        addFragment()
    }

    //Simplemente es una función que agrega un fragmento en el mainActivity
     private fun addFragment(){
         val fragmentEjemploDos = FragmentEjemploDos()
         val fragmentTransaction = fragmentManager.beginTransaction()
         fragmentTransaction.add(R.id.myfragment, fragmentEjemploDos,"myFragment")
         fragmentTransaction.commit()

     }

    /*Al implementar la interface en la clase se implementa al mismo tiempo esta función para hacer uso de ella
    //En esta función recibe un dato de tipo string desde el fragment */
    override fun sendData(dato: String) {
        //Ese dato cachado se le colocará en el TextView
        tvText.setText(dato)
    }

}