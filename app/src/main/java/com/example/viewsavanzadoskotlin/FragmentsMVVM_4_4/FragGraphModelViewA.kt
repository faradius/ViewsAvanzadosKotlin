package com.example.viewsavanzadoskotlin.FragmentsMVVM_4_4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.viewsavanzadoskotlin.R
import com.example.viewsavanzadoskotlin.databinding.FragmentFragGraphModelViewABinding


class FragGraphModelViewA : Fragment(R.layout.fragment_frag_graph_model_view_a) {

    private val viewModel:MainViewModel by activityViewModels()
    private lateinit var binding:FragmentFragGraphModelViewABinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFragGraphModelViewABinding.bind(view)

        binding.btnPasarFragBMVVM.setOnClickListener {
            viewModel.setUsuario(Usuario("AlexMVVM", 28))
            findNavController().navigate(R.id.action_fragGraphModelViewA_to_fragGraphModelViewB)

        }

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<Usuario>("usuario")?.observe(viewLifecycleOwner){ result ->
            Log.d("Usuario", "onViewCreated: ${result.nombre} ${result.edad}")
        }

    }


}