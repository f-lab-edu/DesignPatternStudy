package com.example.decorator_pattern

class BaseCoffee(nickname: String) : Beverage(nickname){

    override fun getCost(): Int {
        return 5000
    }

    override fun getDescription() :String{
        return super.getDescription() + " -> " +nickname +"님의 커피 "
    }
}