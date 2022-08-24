package com.example.viewsavanzadoskotlin.FragmentsConNavigationGraph_4_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.viewsavanzadoskotlin.R


class FragGraphA : Fragment(R.layout.fragment_frag_graph_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvTitulo = view.findViewById<TextView>(R.id.tvTituloFragA)
        val botoNav = view.findViewById<Button>(R.id.btnPasarFragB)

        setFragmentResultListener("valorRequest"){key, bundle ->
            val infoResult = bundle.getString("valorBundle")
            tvTitulo.text = infoResult
        }

        botoNav.setOnClickListener {
            val action = FragGraphADirections.actionFragGraphAToFragGraphB()
            findNavController().navigate(action)

            //findNavController().navigate(R.id.action_fragGraphA_to_fragGraphB, bundleOf("nombre" to "Alex", "edad" to 28))
        }
    }

}