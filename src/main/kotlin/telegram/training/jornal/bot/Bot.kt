package telegram.training.jornal.bot

import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.logging.LogLevel
import telegram.training.jornal.bot.actions.ping

fun main() {
    val bot = bot {
        token = ""
        timeout = 30
        logLevel = LogLevel.Network.Body


        dispatch {
            ping()
        }
    }
}




