package com.example.decorator_pattern

abstract class Beverage(val nickname : String = "") {

    abstract fun getCost() : Int

    open fun getDescription() : String{
        return "음료수를 소개합니다 "
    }

}