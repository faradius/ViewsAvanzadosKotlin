package com.example.viewsavanzadoskotlin.ListViewCustomE1_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.viewsavanzadoskotlin.R

//3° Aqui implementamos el listView con el adapter
class MainActivityListViewCustomE1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list_view_custom_e1)
        //vinculamos el widget
        val listViewCustom = findViewById<ListView>(R.id.lvProducto)

        //creamos diferentes productos de la clase Producto y estos les rellenamos sus parametros con la información correspondiente
        val producto = Producto("Camara", 100.0, "Camara ultimo modelo", R.drawable.camara)
        val producto2 = Producto("PC", 1000.0, "16 GB RAM", R.drawable.pc)

        //Metemos la información en una lista
        val listaProductos = listOf(producto, producto2)

        //Creamos el adaptador y le asignamos el contexto y la lista que este va utilizar para llenar el listview
        val adapter = AdapterProducto(this,listaProductos)

        /*Al widget listView le hacemos referencia que vamos a llenar de información al adaptador y le asignamos esa información
        //que se encuentra almacenada en la variable adapter*/
        listViewCustom.adapter = adapter

        /*Ahora lo que se quiere hacer es que en cada elemento del listview se le pueda hacer click y para ello se llama el evento setOnItemClickListener
        //pero para este caso no solamente se quiere hacer click si no que se quiere pasar a otra pantalla y enviarle la información correspondiente a la activity*/
        listViewCustom.setOnItemClickListener { adapterView, view, position, id ->
            //por medio del intent vamos accionar de que queremos pasar a la segunda activity en el cual este contendra el detalle del producto seleccionado en la listview
            val intent = Intent(this,MainActivityCustomE1Detail::class.java)
            /*por medio del intent y su metodo putExtra le pasamos la lista de valores agregados anteriormente pero con respecto a la posición en el cual se hizo
            //click en el listview y le pondremos un identificador para que el otro activty sepa de donde viene la información*/
            intent.putExtra("producto", listaProductos[position])
            //finalmente ejecutamos el intent
            startActivity(intent)

            /*Cabe mencionar que el putExta no jala asi nadamas por que es necesario de que la clase producto este Serializable y para que esto este asi
            //tenemos que extender de este para que el putExtra no marque error, no se muy bien que significa pero probablemente es un indicador de que
            //se pueda pasar elementos de este tipo por medio del intent*/

        }
    }
}