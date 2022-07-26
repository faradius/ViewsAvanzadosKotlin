package com.example.viewsavanzadoskotlin.ComunicacionFragmentConActivity_3

/*Es necesario utilizar interfaces para enviar datos desde el fragment al activity
//Pero desde un Activity a un fragment no es necesario, esto se pude realizar con un Bundle*/
interface InterfaceFragment {
    //Dentro de la interface solo declaramos una funcion que tiene como parametro una variable de tipo String
    fun sendData(dato:String)
}