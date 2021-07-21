package com.example.foodie_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.foodie_app.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_user.*
import kotlinx.android.synthetic.main.activity_user.view.*

class UserActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var name = intent.getStringExtra("name")
        title_about.text=name

        var price=intent.getStringExtra("price")
        price_about.text=price

        var description=intent.getStringExtra("description")
        recipe_about.text=description

        












    }
}