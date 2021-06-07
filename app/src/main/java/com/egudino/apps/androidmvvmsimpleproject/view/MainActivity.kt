package com.egudino.apps.androidmvvmsimpleproject.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.egudino.apps.androidmvvmsimpleproject.databinding.ActivityMainBinding
import com.egudino.apps.androidmvvmsimpleproject.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteViewModel.observe(this, Observer { currentQuote ->
            binding.textViewContent.text = currentQuote.quote
            binding.textViewAuthor.text = currentQuote.author
        })
        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }

    }
}