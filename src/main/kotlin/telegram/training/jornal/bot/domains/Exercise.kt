package telegram.training.jornal.bot.domains

data class Exercise(
    val title: String,
    val musclesInvited: List<Muscle>,
    val reps: List<Rep> = listOf()
)
