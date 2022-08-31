package com.example.viewsavanzadoskotlin.FragmentsMVVM_4_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.viewsavanzadoskotlin.R
import com.example.viewsavanzadoskotlin.databinding.FragmentFragGraphModelViewBBinding


class FragGraphModelViewB : Fragment(R.layout.fragment_frag_graph_model_view_b) {

    private lateinit var binding: FragmentFragGraphModelViewBBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFragGraphModelViewBBinding.bind(view)

        viewModel.getUsuario().observe(viewLifecycleOwner, Observer { usuario->
            binding.tvOutputFragMVVM.text = "${usuario.nombre} ${usuario.edad}"
        })

        findNavController().previousBackStackEntry?.savedStateHandle?.set("usuario",Usuario("Pepe",30))
    }

}