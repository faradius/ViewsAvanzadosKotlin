package com.example.viewsavanzadoskotlin.FragmentsBackStack_1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewsavanzadoskotlin.R

class ActivityFragmentBackStack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_back_stack)

        val fragment = FragmentBackA()

        val fragmentManager = supportFragmentManager

        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.contentFragmentBack, fragment)

        fragmentTransaction.commit()
    }
}