package com.example.designpatternstudy.State

import android.util.Log

class LowHpState(private val warrior: Warrior) : WarriorState {
    override fun printWarning() {
        Log.d("LowHpState", "위험한 상태 입니다.")
        if (warrior.autoDrink) {
            drink()
        }
    }

    override fun takeDamage(HP: Int, damageScore: Int) {
        val hp = HP - (damageScore * 2)
        warrior.HP = hp
        if (hp <= 0) warrior.state = warrior.deadState
    }

    private fun drink() {
        Log.d("LowHpState", "자동으로 물약이 먹어집니다.")
    }


}