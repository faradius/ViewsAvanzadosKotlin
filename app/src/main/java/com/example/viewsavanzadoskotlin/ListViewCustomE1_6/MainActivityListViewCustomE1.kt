package com.example.viewsavanzadoskotlin.ListViewCustomE1_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.viewsavanzadoskotlin.R

class MainActivityListViewCustomE1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list_view_custom_e1)

        val listViewCustom = findViewById<ListView>(R.id.lvProducto)

        val producto = Producto("Camara", 100.0, "Camara ultimo modelo", R.drawable.camara)
        val producto2 = Producto("PC", 1000.0, "16 GB RAM", R.drawable.pc)

        val listaProductos = listOf(producto, producto2)

        val adapter = AdapterProducto(this,listaProductos)

        listViewCustom.adapter = adapter

        listViewCustom.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this,MainActivityCustomE1Detail::class.java)
            intent.putExtra("producto", listaProductos[position])
            startActivity(intent)

        }
    }
}