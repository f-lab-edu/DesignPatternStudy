package com.example.decorator_pattern


class ChocoCoffee(private var coffee:Beverage) : Decorator() {

    override fun getCost(): Int {
        var cost = coffee.getCost() + 10000
        return cost
    }

    override fun getDescription() : String{
        return coffee.getDescription() + "-> 초코커피 "
    }
}

class MilkCoffee(private var coffee:Beverage) : Decorator() {

    override fun getCost(): Int {
        var cost = coffee.getCost() + 12000
        return cost
    }

    override fun getDescription() : String{
        return coffee.getDescription() + "-> 밀크커피 "
    }

}