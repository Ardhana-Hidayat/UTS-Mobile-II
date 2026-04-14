package com.example.unscramble.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "answer")
data class Answer(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val answer: String
)

