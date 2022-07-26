package com.example.viewsavanzadoskotlin.ComunicacionFragmentConFragment_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.viewsavanzadoskotlin.R

//Se empieza a leer el codigo desde aqui para entender la logica (1°)
class FragmentEjemploA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_ejemplo_a, container, false)
        //Se declaran cada uno de los widgets que tiene el xml de este fragment
        val etMensajeFA = view.findViewById<EditText>(R.id.etMensajeFA)
        val btnSend = view.findViewById<Button>(R.id.btnSend)

        //Se manda a llamar el evento click
        btnSend.setOnClickListener {
            //como primer paso es necesario llamar la interfaz que vamos a utilizar para poderle pasar el dato al activity desde este fragment
            val comunicador: InterfaceComunicacion = activity as InterfaceComunicacion
            //Una vez declarado la interfaz nos permitirá hacer uso del metodo que contenia la interfaz que se llama EnvioDatos
            //en el metodo se espera un valor de tipo string como parametro, ahi le vamos a pasar lo que contenga dentro del editText
            //y ese valor lo castemos para que sea string y se lo enviamos al activity ya que despues el activity se lo va a pasar el fragmentB
            comunicador.EnvioDatos(etMensajeFA.text.toString())

        }

        return view
    }

}