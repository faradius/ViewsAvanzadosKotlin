package com.example.viewsavanzadoskotlin.RecyclerViewCustomE1_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.viewsavanzadoskotlin.R
import com.squareup.picasso.Picasso

class MainActivitySeriesDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_series_detail)

        val photoSerieDetail = findViewById<ImageView>(R.id.ivPhotoSerieDetail)
        val nameSerieDetail = findViewById<TextView>(R.id.tvNameSerieDetail)

        val bundle = intent.extras
        val name = bundle?.getString("nameSerie")
        val image = bundle?.getString("imageSerie")

        Picasso.with(this).load(image).into(photoSerieDetail)
        nameSerieDetail.text = name
    }
}