package com.example.viewsavanzadoskotlin.ListViewCustomE2_7

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R

class AdapterUsuario(private val context: Activity, private val userList: ArrayList<User>) : ArrayAdapter<User>(context, R.layout.item_usuario,userList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view:View = inflater.inflate(R.layout.item_usuario,null)

        val ivProfile = view.findViewById<ImageView>(R.id.ivProfile)
        val tvPersonName = view.findViewById<TextView>(R.id.tvPersonName)
        val tvMessagePerson = view.findViewById<TextView>(R.id.tvMessagePerson)
        val tvTimePerson = view.findViewById<TextView>(R.id.tvTimePerson)

        ivProfile.setImageResource(userList[position].imageId)
        tvPersonName.text = userList[position].name
        tvMessagePerson.text = userList[position].lastMessage
        tvTimePerson.text = userList[position].lastMsgTime

        return view
    }
}