package com.example.viewsavanzadoskotlin.RecyclerViewCustomE1_8

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.viewsavanzadoskotlin.R
import com.squareup.picasso.Picasso

class SeriesAdapter(val seriesHero:List<Series>):RecyclerView.Adapter<SeriesAdapter.SeriesHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SeriesHolder(layoutInflater.inflate(R.layout.item_series, parent, false))
    }

    override fun onBindViewHolder(holder: SeriesHolder, position: Int) {
        holder.render(seriesHero[position])
        holder.view.setOnClickListener {
                val intent = Intent(holder.view.context,MainActivitySeriesDetail::class.java)
                intent.putExtra("imageSerie",seriesHero[position].image)
                intent.putExtra("nameSerie", seriesHero[position].serieName)
                holder.view.context.startActivity(intent)

            //Otra forma de implementarlo: https://www.youtube.com/watch?v=EoJX7h7lGxM&t=460s
            }
    }

    override fun getItemCount(): Int = seriesHero.size
        //return seriesHero.size


    class SeriesHolder (val view:View):RecyclerView.ViewHolder(view){

        fun render(series : Series){
            val tvNameSerie = view.findViewById<TextView>(R.id.tvNameSerie)
            val tvActorSerie = view.findViewById<TextView>(R.id.tvActorSerie)
            val tvPublisher = view.findViewById<TextView>(R.id.tvPublisher)
            val ivPhotoSerie = view.findViewById<ImageView>(R.id.ivPhotoSerie)

            tvNameSerie.text = series.serieName
            tvActorSerie.text = series.actorName
            tvPublisher.text = series.publisher
            Picasso.with(view.context).load(series.image).into(ivPhotoSerie)

        }
    }

}

