package com.example.factory_pattern.Coffee

import com.example.factory_pattern.Coffee.Coffee

class SeoulAmericano : Coffee() {
    override var name: String = "서울 아메리카노"
    override var price: Int = 5000
    override var sugar: Int = 4

}