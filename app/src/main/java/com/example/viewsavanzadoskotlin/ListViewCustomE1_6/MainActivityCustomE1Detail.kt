package com.example.viewsavanzadoskotlin.ListViewCustomE1_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R

class MainActivityCustomE1Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_custom_e1_detail)

        val tvProductoDetalle = findViewById<TextView>(R.id.tvProductoDetalle)
        val tvPrecioDetalle = findViewById<TextView>(R.id.tvPrecioDetalle)
        val tvDescripcionDetalle = findViewById<TextView>(R.id.tvDescripcionDetalle)
        val ivProductoDetalle = findViewById<ImageView>(R.id.ivProductoDetalle)

        val producto = intent.getSerializableExtra("producto") as Producto

        tvProductoDetalle.text = producto.nombre
        tvPrecioDetalle.text = "$${producto.precio}"
        tvDescripcionDetalle.text = producto.descripcion
        ivProductoDetalle.setImageResource(producto.imagen)

    }
}