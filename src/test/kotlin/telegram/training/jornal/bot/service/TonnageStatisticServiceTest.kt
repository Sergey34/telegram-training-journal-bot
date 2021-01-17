package telegram.training.jornal.bot.service

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import telegram.training.jornal.bot.domains.Exercise
import telegram.training.jornal.bot.domains.Muscle

internal class TonnageStatisticServiceTest {
    lateinit var tonnageStatisticService: TonnageStatisticService

    @BeforeEach
    fun setUp() {
        tonnageStatisticService = TonnageStatisticService(TrainingServiceImpl())
    }

    @Test
    fun `calculate Statistic by Exercise`() {
        val statistic = tonnageStatisticService.calculateStatistic(
            0,
            Exercise("Жим лежа", listOf(Muscle.Грудь, Muscle.Трицепс, Muscle.Передняя_дельта))
        )
    }
}
