package com.example.viewsavanzadoskotlin.ComunicacionActivityConFragment_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R


class FragmentEjemplo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_ejemplo, container, false)

        //Aqui especificamos en una variable que va a recibir argumetos de tipo bundle
        var bundle = arguments
        /*En una variable guardamos el dato traido desde el activity
        //Especificamos que en el bundle puede llegar un null y que puede ser de tipo cadena y entero
        //los parametros del metodo se especifica la key y el otro parametro puede seropcional
        //en el cual se puede poner un valor por default en caso de que no traiga un valor en el bundle*/
        var dato = bundle?.getString("DATOS","DEFAULT")
        var numero = bundle?.getInt("NUMERO")

        val tvMensaje = view.findViewById<TextView>(R.id.tvMensaje)
        val tvMensajeSecundario = view.findViewById<TextView>(R.id.tvMensajeSecundario)

        //Colocamos los valores en los TextViews Correspondientes
        tvMensaje.text = dato
        tvMensajeSecundario.text = numero.toString()


        return view
    }


}