package com.example.viewsavanzadoskotlin.FragmentsMVVM_4_4

import android.os.Parcelable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.parcel.Parcelize

class MainViewModel:ViewModel() {

    private val user = MutableLiveData<Usuario>()

    fun setUsuario(usuario: Usuario){
        user.value = usuario
    }

    fun getUsuario(): LiveData<Usuario>{
        return user
    }
}

@Parcelize
data class Usuario(val nombre:String, val edad:Int): Parcelable