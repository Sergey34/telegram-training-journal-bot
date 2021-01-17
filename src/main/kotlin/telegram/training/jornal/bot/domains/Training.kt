package telegram.training.jornal.bot.domains

import java.util.*

data class Training(
    val title: String,
    val date: Date,
    val exercises: List<Exercise>
)
