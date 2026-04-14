package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnswerDao {
    @Query("SELECT * FROM answer")
    fun getAll(): List<Answer>

    @Insert
    fun insert(vararg answer: Answer)
}