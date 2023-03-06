package com.example.factory_pattern.Factory

import com.example.factory_pattern.Coffee.Coffee

abstract class CoffeeFactory {

    fun order(type : String) : Coffee {
        var coffee = makeCoffee(type)
        coffee.addIce()
        coffee.addWhipping()
        coffee.showDescription()

        return coffee
    }

    protected abstract fun makeCoffee(type:String) : Coffee

}