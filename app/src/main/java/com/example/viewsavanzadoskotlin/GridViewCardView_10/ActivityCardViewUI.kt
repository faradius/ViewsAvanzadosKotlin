package com.example.viewsavanzadoskotlin.GridViewCardView_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.viewsavanzadoskotlin.R

class ActivityCardViewUI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view_ui)
    }

    fun pulsar(view:View){
        when(view.tag){
            "home"-> Toast.makeText(this,"HOME",Toast.LENGTH_SHORT).show()
            "idioma"-> Toast.makeText(this,"IDIOMA",Toast.LENGTH_SHORT).show()
            "widgets"-> Toast.makeText(this,"WIDGETS",Toast.LENGTH_SHORT).show()
            "chat"-> Toast.makeText(this,"CHAT",Toast.LENGTH_SHORT).show()
            "calendario"-> Toast.makeText(this,"CALENDARIO",Toast.LENGTH_SHORT).show()
            "info"-> Toast.makeText(this,"INFORMACIÓN",Toast.LENGTH_SHORT).show()
        }
    }
}