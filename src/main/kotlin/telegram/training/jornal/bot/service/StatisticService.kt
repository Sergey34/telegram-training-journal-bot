package telegram.training.jornal.bot.service

import telegram.training.jornal.bot.domains.Exercise
import telegram.training.jornal.bot.domains.Muscle
import java.util.*

interface StatisticService {
    fun calculateStatistic(userId: Long, exercise: Exercise): List<Pair<Date, List<Int>>>
    fun calculateStatistic(userId: Long, muscle: Muscle): List<Pair<Date, List<Int>>>
}
