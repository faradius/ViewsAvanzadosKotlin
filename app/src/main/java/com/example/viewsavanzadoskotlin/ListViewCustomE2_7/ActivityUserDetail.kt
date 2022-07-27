package com.example.viewsavanzadoskotlin.ListViewCustomE2_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewsavanzadoskotlin.R
import com.example.viewsavanzadoskotlin.databinding.ActivityUserDetailBinding

class ActivityUserDetail : AppCompatActivity() {

    private lateinit var binding: ActivityUserDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameDetail = intent.getStringExtra("name")
        val phoneDetail = intent.getStringExtra("phone")
        val countryDetail = intent.getStringExtra("country")
        val imageDetail = intent.getIntExtra("image", R.drawable.profile)


        binding.tvPersonNameDetail.text = nameDetail
        binding.tvPhoneDetail.text = phoneDetail
        binding.tvCountryDetail.text = countryDetail
        binding.ivProfileDetail.setImageResource(imageDetail)
    }
}