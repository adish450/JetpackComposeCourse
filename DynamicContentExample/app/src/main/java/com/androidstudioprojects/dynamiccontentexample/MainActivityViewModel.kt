package com.androidstudioprojects.dynamiccontentexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val text = MutableLiveData<String>()

    fun onTextChanged(newVal: String) {
        text.value = newVal
    }
}