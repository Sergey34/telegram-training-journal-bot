package telegram.training.jornal.bot.service

import telegram.training.jornal.bot.domains.Exercise
import telegram.training.jornal.bot.domains.Muscle
import telegram.training.jornal.bot.domains.calculateTonnage
import java.util.*

class TonnageStatisticService(
    private val trainingService: TrainingService
) : StatisticService {

    override fun calculateStatistic(userId: Long, exercise: Exercise): List<Pair<Date, List<Int>>> {
        val trainings = trainingService.getTrainings(userId, exercise)
        return trainings.map {
            val tonnage = it.exercises
                .filter { e -> e.title == exercise.title }
                .map { e -> e.reps.calculateTonnage() }
            it.date to tonnage
        }
    }

    override fun calculateStatistic(userId: Long, muscle: Muscle): List<Pair<Date, List<Int>>> {
        val trainings = trainingService.getTrainings(userId, muscle)
        return trainings.map {
            val tonnage = it.exercises
                .filter { e -> e.musclesInvited.contains(muscle) }
                .map { e -> e.reps.calculateTonnage() }
            it.date to tonnage
        }
    }
}
