package com.example.viewsavanzadoskotlin.ListViewCustomE2_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewsavanzadoskotlin.R
import com.example.viewsavanzadoskotlin.databinding.ActivityMainLvcustomE2Binding

class MainActivityLVCustomE2 : AppCompatActivity() {

    private lateinit var binding:ActivityMainLvcustomE2Binding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainLvcustomE2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.person1,
            R.drawable.person2,
            R.drawable.person3,
            R.drawable.person4,
            R.drawable.person5,
            R.drawable.person6,
            R.drawable.person7,
            R.drawable.person8,

        )

        val name = arrayOf(
            "Mike",
            "Raul",
            "Ana",
            "Claudia",
            "Rodrigo",
            "Alisa",
            "Diana",
            "Leonardo"
        )

        val message = arrayOf(
            "Hola como estas?",
            "Ya hiciste el trabajo de mañana?",
            "Me gusto tu blusa!!",
            "Estoy jugando con mi perrita",
            "Estoy en la oficina",
            "Estoy explorando el mundo",
            "Me gusta mi casa",
            "Estoy trabajando en un proyecto nuevo"
        )

        val time = arrayOf(
            "8:45 pm", "9:00 am", "7:39 pm", "9:00 am",
            "5:36 am", "10:52 pm", "11:15 am", "5:30 pm"
        )

        val phone = arrayOf(
            "782 152 4523", "785 366 5521", "536 252 2255", "585 477 4125",
            "522 225 3366", "782 152 3669", "585 225 3366", "221 582 2233"
        )

        val country = arrayOf(
            "United States", "Russia", "India", "Israel", "Germany", "Thailand", "Canada", "France"
        )

        userArrayList = ArrayList()

        for (i in name.indices){
            val user = User(name[i], message[i], time[i], phone[i], country[i], imageId[i])
            userArrayList.add(user)
        }

        binding.lvUsers.isClickable = true
        binding.lvUsers.adapter = AdapterUsuario(this,userArrayList)
        binding.lvUsers.setOnItemClickListener { adapterView, view, position, id ->

            val nameData = name[position]
            val phoneData = phone[position]
            val countryData = country[position]
            val imageData = imageId[position]

            val intent = Intent(this,ActivityUserDetail::class.java)
            intent.putExtra("name", nameData)
            intent.putExtra("phone", phoneData)
            intent.putExtra("country", countryData)
            intent.putExtra("image", imageData)
            startActivity(intent)

        }


    }
}