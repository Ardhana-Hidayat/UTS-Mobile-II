package com.example.unscramble.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "answer")
data class Answer(
    @ColumnInfo(name = "user_answer") val answer: String?,
)

