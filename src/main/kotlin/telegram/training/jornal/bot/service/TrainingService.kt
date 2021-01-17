package telegram.training.jornal.bot.service

import telegram.training.jornal.bot.domains.Exercise
import telegram.training.jornal.bot.domains.Muscle
import telegram.training.jornal.bot.domains.Training

interface TrainingService {
    fun getTrainings(userId: Long, exercise: Exercise): List<Training>
    fun getTrainings(userId: Long, exercise: Muscle): List<Training>
    fun createTraining(userId: Long, exercises: List<Exercise>): Training
}
