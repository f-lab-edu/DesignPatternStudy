package com.example.factory_pattern.Factory

import com.example.factory_pattern.Coffee.BusanAmericano
import com.example.factory_pattern.Coffee.BusanMocha
import com.example.factory_pattern.Coffee.Coffee

class BusanCoffeeFactory : CoffeeFactory(){

    override fun makeCoffee(type: String): Coffee {
        return when(type){
            "아메리카노"->  BusanAmericano()
             "모카"->  BusanMocha()
            else -> BusanMocha()
        }
    }
}

