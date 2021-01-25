package com.example.rdb_word_demo.Models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rdb_word_demo.Adapters.WordRepository
import java.lang.IllegalArgumentException

class WordViewModelFactory(private val repository: WordRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WordViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WordViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}