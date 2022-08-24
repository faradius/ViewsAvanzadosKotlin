package com.example.viewsavanzadoskotlin.PasarDatosFragments_4_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.viewsavanzadoskotlin.R


class SegundoFragmentB : Fragment(R.layout.fragment_segundo_b) {

    private var nombre:String? = ""
    private var edad: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nombre= requireArguments().getString(MI_NOMBRE)
        edad=requireArguments().getInt(MI_EDAD)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textOutput = view.findViewById<TextView>(R.id.tv_output)
        val button = view.findViewById<Button>(R.id.btnEnviarDatosFragment)
        button.setOnClickListener {
            val result = "Datos Fragments"
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
        }
        textOutput.text = "$nombre $edad"
    }

    companion object{
        private const val MI_NOMBRE= "nombre"
        private const val MI_EDAD="edad"

        fun newInstance(nombre:String, edad:Int) = SegundoFragmentB().apply {
            arguments = bundleOf(MI_NOMBRE to nombre, MI_EDAD to edad)
        }
    }

}