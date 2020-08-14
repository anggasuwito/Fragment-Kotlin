package com.main.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var counterFragment: CounterFragment
    lateinit var counterShowFragment: CounterShowFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        counterFragmentButton.setOnClickListener(this)
        counterShowFragmentButton.setOnClickListener(this)
        counterFragment = CounterFragment()
        counterShowFragment = CounterShowFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, counterFragment)
            .commit()

    }


    override fun onClick(v: View?) {
        when (v) {
            counterFragmentButton -> {
                switchFragment(counterFragment)
            }
            counterShowFragmentButton -> {
                switchFragment(counterShowFragment)
            }
        }
    }

    fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}