package com.example.viewsavanzadoskotlin.FragmentsBackStack_1_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.viewsavanzadoskotlin.R

class FragmentBackA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_back_a, container, false)

        val btnFragmentBackA = view.findViewById<Button>(R.id.btnFragmentBackA)

        btnFragmentBackA.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.contentFragmentBack, FragmentBackB())?.addToBackStack(null)?.commit()
        }
        return view
    }
}