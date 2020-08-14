package com.main.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.main.myapplication.view_model.CounterViewModel
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter.view.*

class CounterFragment : Fragment(), View.OnClickListener {
    val counterViewModel by activityViewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        increaseButton.setOnClickListener(this)
        decreaseButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        when (view) {
            increaseButton -> {
                counterViewModel.increase()
            }
            decreaseButton -> {
                counterViewModel.decrease()
            }
        }
    }
}