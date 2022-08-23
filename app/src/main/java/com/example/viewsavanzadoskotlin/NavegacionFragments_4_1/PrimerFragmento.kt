package com.example.viewsavanzadoskotlin.NavegacionFragments_4_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit
import com.example.viewsavanzadoskotlin.R


class PrimerFragmento : Fragment(R.layout.primer_fragmento) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val botonPrimerFragment = view.findViewById<Button>(R.id.btn_navegar_fragment2)

        botonPrimerFragment.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedor_fragment, SegundoFragmento())
                addToBackStack("PrimerFragmento")
            }
        }
    }
}