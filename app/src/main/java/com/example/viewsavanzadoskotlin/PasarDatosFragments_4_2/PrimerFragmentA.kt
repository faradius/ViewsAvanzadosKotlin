package com.example.viewsavanzadoskotlin.PasarDatosFragments_4_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.commit
import androidx.fragment.app.setFragmentResultListener
import com.example.viewsavanzadoskotlin.NavegacionFragments_4_1.SegundoFragmento
import com.example.viewsavanzadoskotlin.R


class PrimerFragmentA : Fragment(R.layout.fragment_primer_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonPasarFragment = view.findViewById<Button>(R.id.btn_pasar_fragmentB)
        val resultado = view.findViewById<TextView>(R.id.tv_tituloFragmentUno)

        setFragmentResultListener("requestKey"){key, bundle ->
            val result = bundle.getString("bundleKey")
            resultado.text = result

        }

        botonPasarFragment.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedor_fragment_Datos, SegundoFragmentB.newInstance("Alex",28))
                addToBackStack("PrimerFragmentA")
            }
        }
    }

}