package com.example.foodie_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodie_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList: ArrayList<dish>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.burger_png,
            R.drawable.cheese_chutney_image, R.drawable.cold_coffee_image,
            R.drawable.masala_sandwich_image, R.drawable.paneer_pizza_img
        )
        val name = arrayOf(
            "shezwan burger",
            "cheese chutney ",
            "cold cofee",
            "masala sandwich",
            "Paneer pizza"
        )
        val descriptions = arrayOf(
            "The patties in both the burgers comes with an added flavour of spicy hot chili sauce made with red chilies, tomato, onion, garlic, pepper, soy sauce and vinegar, then drizzled with shredded onions and packed in a lightly toasted bun",
            "The patties in both the burgers comes with an added flavour of spicy hot chili sauce made with red chilies, tomato, onion, garlic, pepper, soy sauce and vinegar, then drizzled with shredded onions and packed in a lightly toasted bun",
            "The patties in both the burgers comes with an added flavour of spicy hot chili sauce made with red chilies, tomato, onion, garlic, pepper, soy sauce and vinegar, then drizzled with shredded onions and packed in a lightly toasted bun",
            "The patties in both the burgers comes with an added flavour of spicy hot chili sauce made with red chilies, tomato, onion, garlic, pepper, soy sauce and vinegar, then drizzled with shredded onions and packed in a lightly toasted bun",
            "The patties in both the burgers comes with an added flavour of spicy hot chili sauce made with red chilies, tomato, onion, garlic, pepper, soy sauce and vinegar, then drizzled with shredded onions and packed in a lightly toasted bun"
        )
        val prices = arrayOf("Rs 250/- only", "Rs 200/-", "Rs 100/- only", "Rs 200/-", "Rs 200/-")
        userArrayList = ArrayList()
        for (i in name.indices) {
            val dish = dish(name[i], prices[i], imageId[i], descriptions[i])
            userArrayList.add(dish)
        }
        binding.ListView.adapter=myAdapter(this,userArrayList)
        binding.ListView.isClickable=true

        binding.ListView.setOnItemClickListener { parent, view, position, id ->
            val name: String =name[position]
            val price=prices[position]
            val description=descriptions[position]
            val imageid=imageId[position]

            val i =Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("price",price)
            i.putExtra("description",description)
            i.putExtra("imageid",imageid)
            startActivity(i)
        }
    }
}

