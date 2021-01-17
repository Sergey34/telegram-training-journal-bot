package telegram.training.jornal.bot.service

import telegram.training.jornal.bot.domains.Exercise
import telegram.training.jornal.bot.domains.Muscle
import telegram.training.jornal.bot.domains.Training

class TrainingServiceImpl : TrainingService {
    override fun getTrainings(userId: Long, exercise: Exercise): List<Training> {
        TODO("Not yet implemented")
    }

    override fun getTrainings(userId: Long, exercise: Muscle): List<Training> {
        TODO("Not yet implemented")
    }

    override fun createTraining(userId: Long, exercises: List<Exercise>): Training {
        TODO("Not yet implemented")
    }
}
