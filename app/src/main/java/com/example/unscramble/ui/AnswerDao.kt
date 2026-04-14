package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AnswerDao {
    @Query("SELECT * FROM answer")
    fun getAll(): Flow<List<Answer>>

    @Insert
    suspend fun insertItem(answer: Answer)
}