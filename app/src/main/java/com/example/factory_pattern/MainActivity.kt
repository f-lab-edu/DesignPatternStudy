package com.example.factory_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.factory_pattern.Factory.BusanCoffeeFactory
import com.example.factory_pattern.Factory.SeoulCoffeeFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var busanCoffeeFactory = BusanCoffeeFactory()
        var mycoffee = busanCoffeeFactory.order("아메리카노")

        var seoulCoffeeFactory = SeoulCoffeeFactory()
        var mycoffee2 =seoulCoffeeFactory.order("아메리카노")
    }
}