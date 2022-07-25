package com.example.viewsavanzadoskotlin.ImplementacionFragments_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewsavanzadoskotlin.R

class ActivityFragmentMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_main)

        //Los fragmentos siempre van en un activity

        //Creamos un objeto de tipo fragmento uno, o tambien creamos el fragmento como un objeto
        val fragmentoUno = FragmentUno()
        //para poder hacer aparecer el fragmento en nuestra interfaz tenemos que escribir la siguientes lineas

        //Aqui estamos definiendo un administrador de fragmentos para administrar los fragmentos dentro del activity
        val fragmentManager = supportFragmentManager

        //Aqui hacemos referencia a las trasancciones con los fragments, es decir aqui definimos que es lo que queremos que haga el fragment
        //por ejemplo: añadir un fragment, eleminarlo, remplazarlo, mover, etc.
        val fragmentTrasaction = fragmentManager.beginTransaction()

        //Aqui definimos el tipo de trasaccion que vamos hacer con el fragmento es decir que se agregará un fragmento
        //para ello le debemos poner un id al xml para poder hacer referencia hacia donde lo vamos a colocar y que fragmento vamos a colocar
        fragmentTrasaction.add(R.id.fragmentUnoView,fragmentoUno)

        //con esta instruccion hacemos que se ejecute la trasaccion, si esto no esta simplemente no hará nada
        fragmentTrasaction.commit()



    }
}