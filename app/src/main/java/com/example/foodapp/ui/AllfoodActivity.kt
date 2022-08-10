 package com.example.foodapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.MyFood
import com.example.foodapp.R
import com.example.foodapp.adapter.MyFoodAdapter
import com.example.foodapp.utils.MySharedPreference
import kotlinx.android.synthetic.main.activity_allfood.*

 class AllfoodActivity : AppCompatActivity() {
     private lateinit var list: ArrayList<MyFood>
     private lateinit var myFoodAdapter: MyFoodAdapter
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_allfood)

         MySharedPreference.init(this)
         list = MySharedPreference.list

         myFoodAdapter = MyFoodAdapter(list, this)
         list_view_foods.adapter = myFoodAdapter
     }
 }
