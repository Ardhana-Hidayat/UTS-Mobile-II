package com.example.unscramble

import android.app.Application
import com.example.unscramble.ui.AnswerDatabase

class AnswerInstance : Application() {
    val AnswerInstance: AnswerDatabase by lazy { AnswerDatabase.getDatabase(this) }
}
