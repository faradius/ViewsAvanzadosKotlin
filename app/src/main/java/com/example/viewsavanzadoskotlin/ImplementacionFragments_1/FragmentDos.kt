package com.example.viewsavanzadoskotlin.ImplementacionFragments_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewsavanzadoskotlin.R

class FragmentDos : Fragment() {
    //Este fragment esta implementado de forma grafica
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dos, container, false)
    }
}