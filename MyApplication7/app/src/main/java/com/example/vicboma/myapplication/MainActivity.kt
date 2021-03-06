package com.example.vicboma.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.vicboma.myapplication.LifeCycle.LIFE_CYCLE
import com.example.vicboma.myapplication.StateMachine.StateMachine

class MainActivity : AppCompatActivity() {

    val stateMachine = StateMachine(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stateMachine.change(LIFE_CYCLE.LOBBY)
    }
}
