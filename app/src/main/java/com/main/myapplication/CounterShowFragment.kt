package com.main.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import com.main.myapplication.view_model.CounterViewModel
import kotlinx.android.synthetic.main.fragment_counter_show.*


class CounterShowFragment : Fragment() {
    val counterViewModel by activityViewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //didalam observer bisa diisi banyak function contoh Observer{mulai(it)proses(it)done(it)} it mereprentasikan nilai yg berubah
        //it disini mereferensi ke counter
        counterViewModel.counter.observe(viewLifecycleOwner, Observer { setCounter(it) })
    }

    fun setCounter(result: Int) {
        counterTextView.text = result.toString()
    }
}