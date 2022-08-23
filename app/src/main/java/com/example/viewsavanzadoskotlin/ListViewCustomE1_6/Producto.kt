package com.example.viewsavanzadoskotlin.ListViewCustomE1_6

import java.io.Serializable

/*1° primero haremos una estructura de datos para llenar la lista, para ello se creará una clase que tendrá los siguientes parametros
//esto es igual a un POJO en java*/
class Producto (val nombre:String, val precio:Double, val descripcion:String, val imagen:Int): Serializable
