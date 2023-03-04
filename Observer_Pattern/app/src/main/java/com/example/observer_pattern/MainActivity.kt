package com.example.observer_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sub = ConcreteSubject("first")
        sub.registerObserver(ConcreteObserverA())
        sub.registerObserver(ConcreteObserverB())

        sub.word = "second word"
        sub.word = "third word"

        var sub2 = ConcreteSubject(1)
        sub2.registerObserver(ConcreteObserverA())
        sub2.registerObserver(ConcreteObserverB())

        sub2.word = 2
        sub2.word = 3
    }
}