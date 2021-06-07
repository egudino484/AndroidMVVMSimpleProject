package com.egudino.apps.androidmvvmsimpleproject.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egudino.apps.androidmvvmsimpleproject.model.QuoteModel
import com.egudino.apps.androidmvvmsimpleproject.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteViewModel = MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteViewModel.postValue(currentQuote)

    }
}