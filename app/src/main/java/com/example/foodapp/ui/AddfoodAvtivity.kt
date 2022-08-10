package com.example.foodapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodapp.MyFood
import com.example.foodapp.R
import com.example.foodapp.utils.MySharedPreference
import kotlinx.android.synthetic.main.activity_addfood_avtivity.*

class AddfoodAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addfood_avtivity)

        MySharedPreference.init(this)

        btn_save.setOnClickListener {
            val name = edt_name.text.toString().trim()
            val km = edt_mahsulot.text.toString().trim()
            val tt = edt_tayyorlash.text.toString().trim()

            if (name!="" && km!="" && tt!="" ){

                val myFood = MyFood(name,km,tt)
                val list = MySharedPreference.list
                list.add(myFood)
                MySharedPreference.list = list

                Toast.makeText(this, "Muvaffaqqiyatli saqland", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "Ma'lumotlarni to'liq kiriting", Toast.LENGTH_LONG).show()

            }
        }
    }
}