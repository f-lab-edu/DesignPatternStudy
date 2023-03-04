package com.example.decorator_pattern

abstract class Decorator() : Beverage(){

     abstract override fun getDescription(): String

}