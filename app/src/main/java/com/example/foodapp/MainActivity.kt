package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.ui.AddfoodAvtivity
import com.example.foodapp.ui.AllfoodActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_taomlar.setOnClickListener {
            startActivity(Intent(this, AllfoodActivity::class.java))
        }
        btn_taomQoshish.setOnClickListener {
            startActivity(Intent(this, AddfoodAvtivity::class.java))

        }
    }
}