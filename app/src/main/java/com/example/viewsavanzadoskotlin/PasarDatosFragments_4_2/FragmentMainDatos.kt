package com.example.viewsavanzadoskotlin.PasarDatosFragments_4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.viewsavanzadoskotlin.NavegacionFragments_4_1.PrimerFragmento
import com.example.viewsavanzadoskotlin.R

class FragmentMainDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_main_datos)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.contenedor_fragment_Datos, PrimerFragmentA())
        }
    }
}