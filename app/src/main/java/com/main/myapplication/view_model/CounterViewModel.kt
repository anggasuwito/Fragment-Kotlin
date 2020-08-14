package com.main.myapplication.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter: MutableLiveData<Int> = MutableLiveData(0)
    fun increase() {
      counter.value =  counter.value?.plus(1)
    }

    fun decrease() {
      counter.value =   counter.value?.minus(1)
    }
}