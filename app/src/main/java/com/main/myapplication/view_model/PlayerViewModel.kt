package com.main.myapplication.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlayerViewModel : ViewModel() {
    val name: MutableLiveData<String> = MutableLiveData("")
    fun setName(newName: String) {
        name.value = newName
    }
}