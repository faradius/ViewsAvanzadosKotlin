package com.example.viewsavanzadoskotlin.ComunicacionFragmentConActivity_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.viewsavanzadoskotlin.R

class FragmentEjemploDos : Fragment(){
    //Declaramos un EditText desde la clase
    private lateinit var etNumeroFragment:EditText

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            //Mandamos a llamar la interface para poder comunicar el fragment con el activity
            //activity es el getContext() en java y el as hace referencia a un casteo o conversion de tipo Interface
            val comunicador:InterfaceFragment = activity as InterfaceFragment

            val view:View = inflater.inflate(R.layout.fragment_ejemplo_dos, container, false)
            etNumeroFragment = view.findViewById(R.id.etNumeroFragment)

            //Declaramos el boton
            val btnEnviarFragment = view.findViewById<Button>(R.id.btnEnviarFragment)

            //Ejecutamos el evento onClick
            btnEnviarFragment.setOnClickListener {
                //Guardamos en una variable lo que se capture del editText
                var xdata = etNumeroFragment.text.toString()
                //usamos la interface y en el metodo senData le enviamos el valor que tiene guardado xdata hacia el activity
                comunicador.sendData(xdata)

                //prepareData()
            }
            return view
    }

    //Propuesta de lujan
    /*private fun prepareData(){
        var xdata = etNumeroFragment.text.toString()
        val comunicador:InterfaceFragment = activity as InterfaceFragment
        comunicador.sendData(xdata)
    }*/

}