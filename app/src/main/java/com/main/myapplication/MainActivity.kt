package com.main.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter_show.*
import kotlinx.android.synthetic.main.fragment_counter_show.*

class MainActivity : AppCompatActivity(), CounterHandler {
    var counter = 0
    lateinit var counterFragment: CounterFragment
    lateinit var counterShowFragment: CounterShowFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment = fragment as CounterFragment
        counterShowFragment = fragment2 as CounterShowFragment
    }

    override fun incrementCounter() {
        counter++
        counterShowFragment.counterChange(counter)
    }

    override fun decrementCounter() {
        counter--
        counterShowFragment.counterChange(counter)
    }


    fun goToSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }

}