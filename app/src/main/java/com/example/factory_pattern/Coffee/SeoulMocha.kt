package com.example.factory_pattern.Coffee

import com.example.factory_pattern.Coffee.Coffee

class SeoulMocha : Coffee() {
    override var name: String = "서울 모카 커피"
    override var price: Int = 7000
    override var sugar: Int = 7
}