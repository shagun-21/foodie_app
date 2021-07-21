package com.example.foodie_app

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myAdapter(private val context: Activity,private val arrayList: ArrayList<dish>):ArrayAdapter<dish>(context,
    R.layout.list_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflator:LayoutInflater= LayoutInflater.from(context)
        val view :View=inflator.inflate(R.layout.list_item,null)

        val dish_photo:ImageView=view.findViewById(R.id.dishPicture)
        val dish_name:TextView=view.findViewById(R.id.dishTitle)
        val dish_price:TextView=view.findViewById(R.id.dishPrice)
        val dish_desc:TextView=view.findViewById(R.id.dish_description)


        dish_photo.setImageResource(arrayList[position].imageId)
        dish_name.text=arrayList[position].dishName
        dish_price.text=arrayList[position].dish_Price
        dish_desc.text=arrayList[position].recipe



        return view
    }
}