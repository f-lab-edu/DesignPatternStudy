package com.example.decorator_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var basecoffee = BaseCoffee("hong")
        val chocoCoffee = ChocoCoffee(basecoffee)

        Log.d("MainActivity",chocoCoffee.getDescription())
        Log.d("MainActivity","커피 가격은 "+ chocoCoffee.getCost() +"입니다.")

        var basecoffee2 = BaseCoffee("Lee")
        val milkCoffee = MilkCoffee(basecoffee2)

        Log.d("MainActivity",milkCoffee.getDescription())
        Log.d("MainActivity","커피 가격은 "+ milkCoffee.getCost() +"입니다.")
    }
}