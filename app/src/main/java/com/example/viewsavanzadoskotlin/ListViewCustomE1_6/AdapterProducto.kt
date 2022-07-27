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


class AdapterProducto(private val mContext: Activity, private val listaProductos: List<Producto>) : ArrayAdapter<Producto>(mContext,R.layout.item_producto, listaProductos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(mContext)
        val view = inflater.inflate(R.layout.item_producto,null)

        val imageView = view.findViewById<ImageView>(R.id.ivProducto)
        val tvNombreProducto = view.findViewById<TextView>(R.id.tvnombreProducto)
        val tvPrecioProducto = view.findViewById<TextView>(R.id.tvPrecioProducto)

        tvNombreProducto.text = listaProductos[position].nombre
        tvPrecioProducto.text = "$${listaProductos[position].precio}"
        imageView.setImageResource(listaProductos[position].imagen)



        return view
    }
}