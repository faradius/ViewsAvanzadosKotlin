package com.example.viewsavanzadoskotlin.NavegacionFragments_4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.viewsavanzadoskotlin.R

class FragmentActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager_fragment_main)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.contenedor_fragment, PrimerFragmento())
        }
    }
}