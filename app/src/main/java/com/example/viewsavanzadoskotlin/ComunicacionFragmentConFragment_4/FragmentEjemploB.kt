package com.example.viewsavanzadoskotlin.ComunicacionFragmentConFragment_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R

//Este es la secuencia logica para entender este tema, segunda parte (2°)
class FragmentEjemploB : Fragment() {
    private lateinit var tvMensajeFB:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_ejemplo_b, container, false)
        //Vinculamos el widget que tiene el xml de este fragment
        tvMensajeFB = view.findViewById(R.id.tvMensajeFB)
        return view
    }

        //Realizamos un metodo que se encargar de recibir el dato desde el activity y tendra como parametro un valor de tipo string
        fun datoRecibido(info: String){
            //Una vez que nos llegue el dato en la variable info se lo colocamos al textView
            tvMensajeFB.setText("Recibimos el dato: $info")
        }
}