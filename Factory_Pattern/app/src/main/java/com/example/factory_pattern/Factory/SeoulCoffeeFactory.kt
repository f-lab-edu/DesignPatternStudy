package com.example.factory_pattern.Factory

import com.example.factory_pattern.Coffee.Coffee
import com.example.factory_pattern.Coffee.SeoulAmericano

class SeoulCoffeeFactory : CoffeeFactory(){

    override fun makeCoffee(type: String): Coffee {
      return when(type){
           "아메리카노"->  SeoulAmericano()
            "모카"->  SeoulAmericano()
          else -> SeoulAmericano()
      }
    }
}