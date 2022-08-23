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
        //Vinculamos cada widget
        val tvProductoDetalle = findViewById<TextView>(R.id.tvProductoDetalle)
        val tvPrecioDetalle = findViewById<TextView>(R.id.tvPrecioDetalle)
        val tvDescripcionDetalle = findViewById<TextView>(R.id.tvDescripcionDetalle)
        val ivProductoDetalle = findViewById<ImageView>(R.id.ivProductoDetalle)

        //Creamos una variable que contendra los datos obtenidos desde la otra activity
        //pero los datos que se reciben del intent vienen serializable, despues le ponemos el identificador igual como se
        //definio en la activity principal para que sepa de donde vienen los datos y que estos datos son de tipo Producto
        val producto = intent.getSerializableExtra("producto") as Producto

        //Despues simplemente se colocan los valores correspondientes en cada uno de los widgets que contiene la interfaz de esta activity
        tvProductoDetalle.text = producto.nombre
        tvPrecioDetalle.text = "$${producto.precio}"
        tvDescripcionDetalle.text = producto.descripcion
        ivProductoDetalle.setImageResource(producto.imagen)

    }
}