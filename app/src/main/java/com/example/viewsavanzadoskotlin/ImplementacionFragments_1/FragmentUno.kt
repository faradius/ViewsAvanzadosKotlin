package com.example.viewsavanzadoskotlin.ImplementacionFragments_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewsavanzadoskotlin.R

class FragmentUno : Fragment() { //Declaramos una clase que derive de fragment para hacer uso de los fragments
    override fun onCreateView( //hacemos uso de la función onCreateView para crear la vista del fragment, el metodo tiene 3 parametros
        inflater: LayoutInflater, //Selecciona el recurso XML que será implementado en el fragment por medio de su ID
        container: ViewGroup?, //Es el viewgroup principal que se encargará de insertar el diseño del fragmento
        savedInstanceState: Bundle? //Proporciona datos acerca del estado del fragment, esto se deriva del ciclo de vida del fragment (reanudado, pausado, detenido)
    ): View? { //al final del metodo lo que se espere que se retorne es una vista o la vista del fragment
        //Aqui regreamos la vista por medio del metodo inflate en el cual nos pide el XML que representa la vista, despues
        // nos pide en donde se va a colocar en este caso en el contenedor o container y terminamos con false para no hacer uso del atach
        return inflater.inflate(R.layout.fragment_uno, container, false)
        //Al final simplemente lo que se hace es enlazar la vista del fragmento con el codigo
    }

}