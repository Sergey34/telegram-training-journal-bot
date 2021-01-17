package telegram.training.jornal.bot.domains

data class Program(
    val userId: Long,
    val trainings: List<Training>
)
