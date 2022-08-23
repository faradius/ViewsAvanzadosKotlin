package com.example.viewsavanzadoskotlin.ListViewCustomE1_6

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R

/*2° despues se creará un adaptador que tendrá como función rellenar de información cada uno de los elementos de la lista, por ello se tiene que preparar un adaptador
//para despues rellenarlo con información cuando este sea llamado*/

/*Creamos una clase llamada AdapterProducto este pedirá un contexto y una lista de tipo Producto, despues la clase extenderá
* de la clase ArrayAdpater y este debe de ser de tipo producto y este pide tres parametros los cuales son: el contexto, la vista de cada elemento de la lista
* y la lista de elementos que se pondrá en la listView*/
class AdapterProducto(private val mContext: Activity, private val listaProductos: List<Producto>) : ArrayAdapter<Producto>(mContext,R.layout.item_producto, listaProductos) {

    /*Para poder implementar la información que se pondrá en la listview es necesario sobre escribir el metodo getView, este tiene como objetivo
    //vincular y preparar la vista que tendra cada elemento de la listview*/
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //Creamos la variable inflater y le asignamos el contexto sobre el cual este trabajará la vista de cada elemento de la listview
        val inflater = LayoutInflater.from(mContext)
        //En la variable view le asignamos el xml que se trabajará
        val view = inflater.inflate(R.layout.item_producto,null)

        //vinculamos cada widget con el adapter o el codigo
        val imageView = view.findViewById<ImageView>(R.id.ivProducto)
        val tvNombreProducto = view.findViewById<TextView>(R.id.tvnombreProducto)
        val tvPrecioProducto = view.findViewById<TextView>(R.id.tvPrecioProducto)

        //A cada widget se el asignará su valor correspondiente con relación a la posicion de la lista
        tvNombreProducto.text = listaProductos[position].nombre
        tvPrecioProducto.text = "$${listaProductos[position].precio}"
        imageView.setImageResource(listaProductos[position].imagen)

        //Aqui regresamos la vista
        return view
    }
}