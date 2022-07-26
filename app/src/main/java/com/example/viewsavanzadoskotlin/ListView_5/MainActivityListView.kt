package com.example.viewsavanzadoskotlin.ListView_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.viewsavanzadoskotlin.R

class MainActivityListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list_view)

        //Viculo el widget con el codigo
        val lvPersona = findViewById<ListView>(R.id.lvPersona)

        //Creo una lista de elementos de tipo string
        val persona = mutableListOf("Carlos", "Laura", "Pedro", "Roberto", "Cesar", "Alex")

        /*Creo el adaptador en el cual hace referencia a este contexto, la vista que se utilizará es de un recurso que ya tiene android studio
        //y se le cargará la lista de elementos que esta guardada en la variable persona*/
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,persona)

        //Entonces al listview que esta en la interfaz de esta activty le ponemos el adaptador que definimos anteriormente
        lvPersona.adapter = arrayAdapter

        /*Ahora en el listView vamos habilitar el evento setOnItemClickListener para que reconozca el click que se le haga por elemento seleccionado en la lista
        //En esta lambda pide cuatro parametros, el primero hace referencia al adaptador, el otro a la vista que se le hizo clic en el adaptador, el siguiente
        //parametro es la posicion de la vista en el adaptador y el ultimo es el id de la fila del elemento en el que se hizo clic. */
        lvPersona.setOnItemClickListener { adapterView, view, position, id ->
            /*Lo que hacemos simplemente es mostrar un mensaje cuando se le haga clic algun elemento del listView y este nos devolverá el valor
            //En el Toast le pasamos el contexto, despues lo que va a decir el mensaje y para hacer lo que se comento anteriormente
            //es necesario hacer referencia al adaptador, despues obtener la posicion del item con el metodo getItemAtPosition y en el parametro
            //que pide ese metodo le ponemos la posicion y finalmente le hacemos un casteo para que el resultado sea de tipo string y asi no haya
            //error en el toast, por ultimo nadamas ponemos la duración del toast y lo mostramos*/
            Toast.makeText(this, adapterView.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show()
        }
    }
}