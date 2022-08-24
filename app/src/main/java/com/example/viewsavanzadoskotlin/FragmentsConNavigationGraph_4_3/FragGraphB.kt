package com.example.viewsavanzadoskotlin.FragmentsConNavigationGraph_4_3

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.viewsavanzadoskotlin.PasarDatosFragments_4_2.SegundoFragmentB
import com.example.viewsavanzadoskotlin.R


class FragGraphB : Fragment(R.layout.fragment_frag_graph_b) {
    private var nombreArg: String? = ""
    private var edadArg: Int? = 0
    val args: FragGraphBArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        nombreArg = args.nombrePersona
        edadArg = args.edadPersona

        /* arguments?.let { bundle->
            nombreArg =bundle.getString("nombre")
            edadArg = bundle.getInt("edad")
        }*/

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv_outputFrag = view.findViewById<TextView>(R.id.tv_outputFrag)
        val btnEnviarDatosFrag = view.findViewById<Button>(R.id.btnEnviarDatosFrag)

        btnEnviarDatosFrag.setOnClickListener {
            val result = "información enviada desde otro fragment"
            setFragmentResult("valorRequest", bundleOf("valorBundle" to result))
            findNavController().navigate(Uri.parse("cursoandroid://card"))
            //findNavController().navigate(R.id.product_graph)
        }

        tv_outputFrag.text = "$nombreArg $edadArg"
    }
}