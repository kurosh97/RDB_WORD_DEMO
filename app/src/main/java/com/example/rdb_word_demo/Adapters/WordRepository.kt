package com.example.rdb_word_demo.Adapters

import androidx.annotation.WorkerThread
import com.example.rdb_word_demo.DAO.WordDao
import com.example.rdb_word_demo.Models.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()


    @Suppress("ReduntantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }


}