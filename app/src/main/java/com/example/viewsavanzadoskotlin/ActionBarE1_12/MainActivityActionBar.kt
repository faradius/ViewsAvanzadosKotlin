package com.example.viewsavanzadoskotlin.ActionBarE1_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.viewsavanzadoskotlin.R

class MainActivityActionBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_action_bar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.nav_attach ->{
                Toast.makeText(this,"Seleccionó la opción Adjuntar", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.nav_add ->{
                Toast.makeText(this,"Seleccionó la opción Agregar", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.nav_settings ->{
                Toast.makeText(this,"Seleccionó la opción Configuración", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.nav_notification ->{
                Toast.makeText(this,"Seleccionó la opción Notificación", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.nav_exit ->{
                Toast.makeText(this,"Seleccionó la opción Salir", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }
}