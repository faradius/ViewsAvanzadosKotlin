package com.example.viewsavanzadoskotlin.ComunicacionFragmentConFragment_4
//Se crea una interfaz para poderse comunicar entre el activity y los fragments
interface InterfaceComunicacion {
    //la interfaz tendra una funcion con un parametro de tipo cadena
    fun EnvioDatos(dato:String)
}